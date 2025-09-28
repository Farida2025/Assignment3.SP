// ---------------------------
// Adapter
// ---------------------------
// The Adapter implements the Target interface and internally uses the Adaptee.
// It converts XML data into JSON for the client.
class XmlToJsonAdapter implements JsonParser {
    // Contains a reference to the Adaptee
    private XmlParser xmlParser;

    // Constructor
    public XmlToJsonAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    // Method of the Target interface
    @Override
    public String parseToJson(String inputData) {
        // 1. First, use the Adaptee to parse XML
        String parsedXml = xmlParser.parseXml(inputData);

        // 2. Convert the result into JSON
        // In real life, you could use a library like Gson or Jackson
        String jsonData = "{ \"data\": \"" + parsedXml + "\" }";

        // Return the JSON string to the client
        return jsonData;
    }
}