package oops.Abstraction.interFace;

public class MessageServiceImpl implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("sending message");
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        MessageService messageService1 = new MessageServiceImpl();
        messageService.sendMessage();

    }
}

