public class OddFunction {
    public static void printOddSum(int n) {
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 20;
        printOddSum(n);
    }
}