package Patterns.AbstractFactory;

class MicroCar extends Car{
    MicroCar(Location location){
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    protected void construct(){
        System.out.println("constructed micro car");
    }
}
