package DSA;
//Factorial withot using recursion
public class FactWOUR {
    public static int Fact(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(Fact(n));
    }
}
