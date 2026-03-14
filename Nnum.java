//Sum of n numbers in java
import java.util.Scanner;
class Nnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements");
        int sum = 0;
        n = scanner.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            sum += a;
        }
        System.out.println("Sum of three numbers :" + sum);
    }
}