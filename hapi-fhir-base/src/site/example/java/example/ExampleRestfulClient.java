package example;

import java.util.List;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu.resource.Patient;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.rest.client.IRestfulClientFactory;

@SuppressWarnings("unused")
public class ExampleRestfulClient {
	
//START SNIPPET: client
public static void main(String[] args) {
   FhirContext ctx = new FhirContext(Patient.class);
   IRestfulClientFactory clientFactory = ctx.newRestfulClientFactory();
   String serverBase = "http://foo.com/fhirServerBase";
   RestfulClientImpl client = clientFactory.newClient(RestfulClientImpl.class, serverBase);
   
   // The client is now ready for use!
   List<Patient> patients = client.getPatient(new StringDt("SMITH"));
   
}
//END SNIPPET: client

}