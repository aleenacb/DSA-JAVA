class Pascal {
    public int factorial (int a) {
        if (a == 0) 
            return 1;
            return a * factorial(a - 1);
    }
    public static void main(String[] args) {
        Pascal p = new Pascal();
        int k = 4;
        int a, b;
        //outer loop
        for (a = 0; a <= k; a++) {
            //inner loop 1
            for (b = 0; b <= k - a; b++) {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) {   
        System.out.print(" " + p.factorial(a) / (p.factorial(a - b) * p.factorial(b)));
        }
        System.out.println();
    }
    }
}