package src.message;
import java.util.HashMap;


public class MessageDecoder {

    // Fix message 
    private String message;
    private HashMap<String, String> tagMap = new HashMap<String, String>();

    public MessageDecoder(String message) {
        decodeMessage(message);
    }

    private void decodeMessage(String message) {
        // Seperate Strings by SOH delimiter
        String[] tags = message.split("\u0001");
        for (String tag : tags) {
            String tagNum = tag.split("=")[0];
            String tagValue = tag.split("=")[1];
            tagMap.put(tagNum, tagValue);
        }
    }

    public void printMessage() {
        System.out.println(tagMap.toString());
    }
}
