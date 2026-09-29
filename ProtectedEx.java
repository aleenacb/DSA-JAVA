package p1;
public class Vehicle {
    protected int speed;
}

// File: Bike.java in package p2
package p2;
import p1.Vehicle;
public class Bike extends Vehicle {
    void showSpeed() {
        speed = 100; // allowed: subclass in different package
        System.out.println(speed);
    }
}

// File: Test.java in package p2
package p2;
import p1.Vehicle;
public class Test {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.showSpeed(); // prints 100

        Vehicle v = new Vehicle();
        // System.out.println(v.speed); // ERROR: cannot access protected outside package & non-subclass
    }
}
