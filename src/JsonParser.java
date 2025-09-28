// ---------------------------
// Target Interface
// ---------------------------
// This is the interface that the client expects.
// It defines the method that the client can call.
interface JsonParser {
    // Method to get data in JSON format
    String parseToJson(String inputData);
}