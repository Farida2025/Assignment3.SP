// ---------------------------
// Client
// ---------------------------
// The client works only with the Target interface.
// It does NOT know that an Adaptee and Adapter exist.
public class Client {
    public static void main(String[] args) {
        // Create an Adaptee object
        XmlParser xmlParser = new XmlParser();

        // Create an Adapter and pass the Adaptee to it
        JsonParser adapter = new XmlToJsonAdapter(xmlParser);

        // Client calls the method through the Target interface
        String inputXml = "<note><to>User</to><message>Hello!</message></note>";
        String jsonResult = adapter.parseToJson(inputXml);

        // Print the result
        System.out.println(jsonResult);
    }
}