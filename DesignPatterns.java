import Patterns.*;
import Patterns.Factory.*;

public class DesignPatterns {
    public static void main(String[] args){
        // Singleton Pattern
        Singleton obj = Singleton.getInstance();
        System.out.println(obj);

        // Factory Design Pattern
        NotificationService.sendNotification("SMS");
        NotificationService.sendNotification("EMAIL");
        // NotificationService.sendNotification("PUSH");

    }
}

class NotificationService{
    static void sendNotification(String type){
        Notification notification = NotificationFactory.createNotification(type);
        notification.notifyUser();
    }
}