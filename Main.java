//Abstraction class
abstract class Vehicle {
    //Abstract methods
    abstract void accelerate();
    abstract void brake();

    //Concrete method(common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}
//Concrete implementation(hidden details)
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car pressing gas pedal...");
        //Hidden complex logic: fuel injection, gear shifting etc.
    }
    void brake() {
        System.out.println("Car applying brakes...")
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}