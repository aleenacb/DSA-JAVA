//Swap using XOR operator
public class SwapXOR {
    static void SwapUsingXOR(int m, int n) {
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("Values of m is " + m);
        System.out.println("Values of n is " + n);
    }
    public static void main(String[] args) {
        int m = 8, n = 7;
        SwapUsingXOR(m, n);
    }
}
