import java.util.Scanner;
public class User {
    public static void main(String [] args) {
        //Create The Scanner class object
        Scanner scn = new Scanner(System.in);
        //Enter the first number
        System.out.println("Enter the first number: ");
        int a = scn.nextInt();
        //Enter the second number
        System.out.println("Enter the second number: ");
        int b = scn.nextInt();
        System.out.println("Sum :" +(a + b));
        //Closing the scanner to release all resources
        scn.close();
    }
}