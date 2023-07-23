package Patterns.Factory;

public class NotificationFactory {
    public static Notification createNotification(String type){
        switch(type){
            case "SMS":
                return new SMSNotification();   
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException(String.format("Invalid Notification Type: %s", type));
        }
    }
}
