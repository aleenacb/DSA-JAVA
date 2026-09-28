package OOPS;
class AnimalFamily{
    void sound() {
        System.out.println("Animals make sound");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Cat d = new Cat();
        d.sound();
        System.out.println(d);
    }
}
