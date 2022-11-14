package PolimorfismeNotification;

public class SMSNotification implements Notification{

    @Override
    public void sendMessage(String receiver, String content){
        System.out.println("Send SMS to " + receiver + " with contents");
        System.out.println(content);
    }
}
