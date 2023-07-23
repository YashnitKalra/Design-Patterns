package Patterns.AbstractFactory;

class IndiaCarFactory {
    static Car buildCar(CarType model){
        switch(model){
            case LUXURY:
                return new LuxuryCar(Location.INDIA);
            case MICRO:
                return new MicroCar(Location.INDIA);
            case MINI:
                return new MiniCar(Location.INDIA);
        }
        return null;
    }    
}
