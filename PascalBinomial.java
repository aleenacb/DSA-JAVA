public class PascalBinomial {
    public static void printPascal(int k) {
        for (int line = 1; line <= k; line++) {
            for (int b = 0; b <= k - line; b++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int a = 1; a <= line; a++) {
                System.out.print(c + " ");
                c = c * (line - a) / a;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        printPascal(n);
    }
}
