package Patterns.AbstractFactory;

public class CarFactory {
    private CarFactory(){}

    public static Car buildCar(CarType type){
        // here we can write a gps function
        // that will retrieve the location
        // by default taking India for now
        Location location = Location.INDIA;

        switch(location){
            case INDIA:
                return IndiaCarFactory.buildCar(type);
            case USA:
                return USACarFactory.buildCar(type);
            case DEFAULT:
                return DefaultCarFactory.buildCar(type);
        }

        return null;
    }
}
