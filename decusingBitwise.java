//Converting decimal to binary numbers using bitwise
public class decusingBitwise {
    public void decToBinary(int n) {
        //Sizing of integer of 32
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0) 
            System.out.print("1");
            else
            System.out.print("0");
        }

    }
    public static void main(String[] args) {
        decusingBitwise b = new decusingBitwise();
        int n = 32;
        System.out.println("Decimal -" + n);
        System.out.print("Binary -");
        b.decToBinary(n);
    }
}