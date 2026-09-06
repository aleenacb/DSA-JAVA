package DSA;
import java.util.Scanner;
public class InputEx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Reading one single integer
        System.out.print("Enter sentence");
        String sentence = scn.nextLine();
        System.out.println("Entered Sentence: " + sentence);

        //Reading integer value
        System.out.print("Enter integer value");
        int x = Integer.parseInt(scn.next());
        System.out.println("Entered integer " + x);

        //Reading float value
        System.out.print("Enter float value");
        float f = Float.parseFloat(scn.next());
        System.out.println("Entered float " + f);
        scn.close();
    }
}