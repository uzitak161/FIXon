package src.message;
import src.message.MessageDecoder;

public class NewOrder implements IMessage {


    public NewOrder(String message) {   
        // This is a placeholder for the actual implementation
        MessageDecoder decoder = new MessageDecoder(message);
        decoder.printMessage();
    }


    public boolean validateMessage(String message) {
        // This is a placeholder for the actual implementation

        return true;
    }

    private boolean validateNewOrder() {
        // This is a placeholder for the actual implementation

        return true;
    }

}
