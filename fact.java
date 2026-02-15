import java.util.Scanner;
public class fact {
    public static void printFactorial(int n) {
        int factorial = 1;
        // here for loop is n to i because 5 * 4 * 3 * 2 * 1
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}