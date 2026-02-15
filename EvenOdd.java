import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = scan.nextInt();
        FindEvenOdd(num);
    }
    public static void FindEvenOdd(int num) {
        if (num % 2 == 0)
        System.out.println(num + " Number is even");
        else 
        System.out.println(num + " Number is odd");
    }
}