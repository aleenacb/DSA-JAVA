class Vehicl {
    protected int speed;
}
class Bike extends Vehicle {
    void setSpeed(int s) {
        speed = s;
    }
    int getSpeed(){
        return speed;
    }
}

public class AMProtected {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("The speed perkm " + b.getSpeed());
        Vehicl v  = new Vehicl();
        System.out.println(v.speed);
    }
}
