package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }


    public String getName() {
        return name;
    }

    private String startEngine(){
        return "car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate";
    }

    public String brake(){
        return "Car -> brake()";
    }

}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi ->  brake";
    }


}

 class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate";
    }

    @Override
    public String brake() {
        return "Honda ->  brake";
    }


}

 class Benz extends Car{
    public Benz(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() { return "Ford -> accelerate";
    }

    @Override
    public String brake() { return "Ford ->  brake";
    }


}
public class Main {

    public static void main(String[] args) {
	Car car = new Car(8,"Base car");
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Ford 4WD");
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Honda ford = new Honda(6,"Ford 4WD");
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Honda honda = new Honda(6,"Honda Accord");
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
    }


}
