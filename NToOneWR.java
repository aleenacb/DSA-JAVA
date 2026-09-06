package DSA;
//printing N to One using recursion
public class NToOneWR {
    public static void printNtoOne(int n) {
        if (n == 0)
        return;
        System.out.print(n + " ");
        printNtoOne(n - 1);
    }
    public static void main(String[] args) {
        int n = 3;
        printNtoOne(n);
    }
}
