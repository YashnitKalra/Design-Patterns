package Patterns.AbstractFactory;

public abstract class Car{
    CarType model;
    Location location;

    Car(CarType model, Location location){
        this.model = model;
        this.location = location;
    }

    @Override
    public String toString(){
        return String.format("Car Model: %s, Location: %s", model, location);
    }

    abstract void construct();
}