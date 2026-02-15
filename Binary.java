public class Binary {
    //Functions used to convert decimal to binary numbers
    static void decToBinary(int n) {
        //An array to store binary numbers
        int [] binaryNum = new int[1000];
        //counter for an array
        int i = 0;
        while(n > 0) {
            //storing an binary number remainder
            binaryNum[i] = n % 2;
            n = n / 2;
            i++; 
        }
        //printing an reverse binary array
        for (int j = i - 1; j >= 0; j--)
        System.out.print(binaryNum[j]);
    }
    public static void main(String[] args) {
        int n = 17;
        System.out.println("Decimal -" + n);
        System.out.println("Binary -");
        decToBinary(n);
    }
}