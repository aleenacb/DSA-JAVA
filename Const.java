class Car {
    String model;
    int year;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void display() {
        System.out.println(model + " " + year);
    }
}
public class Const {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", 2025);
        myCar.display();
    }
}