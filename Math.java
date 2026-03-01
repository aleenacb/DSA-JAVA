//Using Math power method (without Using Arrays)
public class Math {
    //Function used to convert the decimal number into binary number
    static int decToBinary(int N) {
        //Store the binary numbers
        int B_Number = 0;
        //Intialize count to 0
        int cnt = 0;
        //Quotient should not be greater than 0
        while (N != 0) {
            //Remainder must be modulus by quotient of 2
            int rem = N % 2;
            //Using Math Power
            double c = java.lang.Math.pow(10, cnt);
            //Append the remainder of Binary number
            B_Number += rem * c;
            //Update the quotient dividing it by 2
            N /= 2;
            //Count used to store exponent value
            cnt++;
        }
        //Return binary number
        return B_Number;
    }
    //Main method
    public static void main(String[] args) {
        int N = 17;
        System.out.println("Decimal- " + N);
        System.out.println("Binary -" + decToBinary(N));
    }
}
/*Useful for all the Conversion of decimal number to binary number
Decimal number : 17
2|_17_ 1  ^
2|_8__ 0  |
2|_4__ 0  |
2|_2__ 0  |
  1       |
--------->|
Binary Number : 10001
Steps for Conversion
1. Intialize a decimal number to 10
2. Call the decimalToBinary() mathod with the decimal number as the argument
3. Inside the decimalToBinary() method, initialize variables remainder, quotient, and binaryNum.
4. While the quotient is greater than 0, do the following:
    a. Compute the remainder by taking the modulus of the quotient with 2
    b. Append the remainder to the beginning of the binary number String.
    c. Update the quotient by dividing it by 2.
5. Return the binaryNum string.
6. Print the decimal number and the binary representation of the number
*/
