class Fibo2 {
    // Method to calculate the sum of Fibonacci numbers at even indices up to 2n
    static int Fib_even_sum(int n) {
        // If n is less than or equal to 0, return 0 as there are no Fibonacci numbers to sum
        if (n <= 0) 
            return 0;

        // Create an array to store Fibonacci numbers up to the 2n-th term
        int fib[] = new int [2 * n + 1];

        // Initialize the first two Fibonacci numbers
        fib[0] = 0;
        fib[1] = 1;

        // Variable to store the sum of even-indexed Fibonacci numbers
        int s = 0;

        // Loop to calculate Fibonacci numbers and sum those at even indices
        for (int j = 2; j <= 2 * n; j++) {
            // Calculate the j-th Fibonacci number
            fib[j] = fib[j - 1] + fib[j - 2];

            // If the index is even, add the Fibonacci number to the sum
            if (j % 2 == 0)
                s += fib[j];
        }

        // Return the sum of even-indexed Fibonacci numbers
        return s;
    }

    public static void main(String[] args) {
        // Define the number of terms to consider
        int n = 11;

        // Print the sum of Fibonacci numbers at even indices up to the 2n-th term
        System.out.println("Even sum of fibonacci" + n + " is :" + Fib_even_sum(n));
    }
}