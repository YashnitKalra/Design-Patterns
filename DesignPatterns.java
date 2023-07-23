import Patterns.*;
import Patterns.AbstractFactory.*;
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

        // Abstract Factory Design Pattern
        Car luxuryCar = CarFactory.buildCar(CarType.LUXURY);
        Car microCar = CarFactory.buildCar(CarType.MICRO);
        System.out.println(luxuryCar);
        System.out.println(microCar);
    }
}

class NotificationService{
    static void sendNotification(String type){
        Notification notification = NotificationFactory.createNotification(type);
        notification.notifyUser();
    }
}