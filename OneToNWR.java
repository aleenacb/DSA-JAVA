package DSA;
// printing 1 to n with using recursion
public class OneToNWR {
    static void printN(int n) {
        if (n == 0)
        return;
        printN(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 3;
        printN(n);
    }
}
