public class zerotoonePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                //if it is 1 then it is even, if it is odd then it is 0
                if (sum % 2  == 0) {//here we sre checking whether it is even or odd
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
