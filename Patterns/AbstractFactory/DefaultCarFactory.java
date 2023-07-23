package Patterns.AbstractFactory;

class DefaultCarFactory {
    static Car buildCar(CarType model){
        switch(model){
            case LUXURY:
                return new LuxuryCar(Location.DEFAULT);
            case MICRO:
                return new MicroCar(Location.DEFAULT);
            case MINI:
                return new MiniCar(Location.DEFAULT);
        }
        return null;
    } 
}
