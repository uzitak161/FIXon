package src.actions;

import java.util.HashMap;

public class addTag {
    
    public void addTag() {

    }

    public HashMap<String, String> addTag(HashMap<String, String> message, String tag, String value) {
        // Creates shallow copy of message and adds tag and value to it
        HashMap<String, String> newMessage = new HashMap<>();
        
        // Create deep copy of message, Strings are immutable so no need to create deep copy
        for (String key : message.keySet()) {
            newMessage.put(key, (message.get(key)));
        }

        if (newMessage.containsKey(tag)) {
            throw new IllegalStateException();
        }
        newMessage.put(tag, value);
        return message;
    }

}
