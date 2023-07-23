package Patterns.AbstractFactory;

class MiniCar extends Car{
    MiniCar(Location location){
        super(CarType.MINI, location);
        construct();
    }

    @Override
    protected void construct(){
        System.out.println("constructed mini car");
    }
}
