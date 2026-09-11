package Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Initial "+num);
        num += 5;
        System.out.println("Add + 5 "+num);
        num *= 2;
        System.out.println("Mul * 2 " + num);
        num -= 5;
        System.out.println("Sub - 5 " + num);
        num /= 2;
        System.out.println("Div / 2 " + num);
        num %= 3;
        System.out.println("Mod % 3 " + num);
    }
}
