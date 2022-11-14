package PolimorfismeNotification;

public class EmailNotification implements Notification{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Send email to " + receiver + " with contents");
        System.out.println(content);
    }
}
