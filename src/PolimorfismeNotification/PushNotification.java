package PolimorfismeNotification;

public class PushNotification implements Notification{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Push notification to : " + receiver + " with contents");
        System.out.println(content);
    }
}
