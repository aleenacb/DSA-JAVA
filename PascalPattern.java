class PascalPattern {
    public static int factorial(int n) {
        if (n == 0) 
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        PascalPattern pp = new PascalPattern();
        int k = 4; // Number of rows in Pascal's Triangle
        int a, b;

        // Outer loop: Iterates through each row of Pascal's Triangle
        for (a = 0; a <= k; a++) {
            // First inner loop: Prints spaces to align the numbers in a triangular format
            for (b = 0; b <= k - a; b++) {
                System.out.print(" "); // Creates the triangular shape by adding spaces
            }

            // Second inner loop: Calculates and prints the numbers in the current row
            for (b = 0; b <= a; b++) {
                // Prints the binomial coefficient C(a, b) = a! / ((a-b)! * b!)
                System.out.print(" " + pp.factorial(a) / (pp.factorial(a - b) * pp.factorial(b)));
            }

            // Moves to the next line after printing all numbers in the current row
            System.out.println();
        }
    }
}
