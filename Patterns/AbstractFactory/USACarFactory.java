package Patterns.AbstractFactory;

class USACarFactory {
    static Car buildCar(CarType model){
        switch(model){
            case LUXURY:
                return new LuxuryCar(Location.USA);
            case MICRO:
                return new MicroCar(Location.USA);
            case MINI:
                return new MiniCar(Location.USA);
        }
        return null;
    } 
}
