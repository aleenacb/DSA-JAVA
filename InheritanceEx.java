//Inheritance allows one class to acquire properties and methods of another class
package OOPS;
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println(d);
        
    }
}
