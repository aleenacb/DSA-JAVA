//An abstract class is a class that can contain abstract methods(without a body) and normal methods(With a body).
package OOPS;
abstract class AnimalRelationship {
    abstract void sound();
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow mowes");
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        Cow d = new Cow();
        d.sound();
        d.eat();
    }
}