//Swapping of two numbers using Bitwise operator
public class Bitwise {
    public static void main(String [] args) {
        int m = 25, n = 12;
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("Value of a is " + m + " and value of b is " + n);
    }
}
