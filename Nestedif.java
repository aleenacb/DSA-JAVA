import java.util.Scanner;
class Nestedif {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x == y) {
            System.out.println("X is equal to y");
        }
        else 
            if (x > y) {
                System.out.println("x is greater than y");
            }
            else {
                System.out.println("x is lesser than y");
            }
        
        scn.close();
    }
}