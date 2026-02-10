import java.util.Scanner;
public class AddFunction {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input a:");
        int a = sc.nextInt();
        System.out.println("Enter the input b:");
        int b = sc.nextInt();
        System.out.println("Sum :" + add(a, b));
    }
}