package OOPS;
//Polymorphism means one name, multiple forms
//there are two types of Polymorphism
//1.Compile time Polymorphism - Method overloading
//2.Runtime Polymorphism - Method overriding

//Method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class PolymorphismEx {
    public static void main(String[] args) {
        //int a = 12, b = 10, c = 12;
        Calculator c = new Calculator();
        c.add(12, 10);//Here method has same name "add" but method has different parameters (a, b and a, b, c)
        c.add(15, 10, 8);
        System.out.println(c);
    }
}
