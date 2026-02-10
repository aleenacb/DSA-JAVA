import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum+= digit * digit * digit;
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber+ "is Armstrong number");
        } else {
            System.out.println(originalNumber+ "is not Armstrong number");
        }
    }
}