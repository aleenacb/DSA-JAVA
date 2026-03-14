import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row :");
        int row = scn.nextInt();
        System.out.println("Enter the column :");
        int col = scn.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        scn.close();
    }
}