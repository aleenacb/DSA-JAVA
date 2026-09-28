package OOPS;
public class StaticMethodEx {
    public static void greet() {
        System.out.println("Hello! Aleena");
    }
    public static void main(String[] args) {
        greet();
        StaticMethodEx.greet();
    }
}