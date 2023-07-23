package Patterns.AbstractFactory;

class LuxuryCar extends Car{
    LuxuryCar(Location location){
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct(){
        System.out.println("constructed luxury car");
    }
}