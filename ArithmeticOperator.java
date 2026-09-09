package Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10, b = 3;
        //Addition
        int sum = a + b;
        //Subtraction
        int sub = a - b;
        //Multiplication
        int mul = a * b;
        //Divide
        int div = a / b;
        //Modulus
        int mod = a % b;
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + sub);
        System.out.println("Multiplication : " + mul);
        System.out.println("Division : " + div);
        System.out.println("Modulus : " + mod);
    }
}