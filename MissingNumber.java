package DSA;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1};
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        int missingnum = expectedSum - actualSum;
        System.out.println("Missing Number : " + missingnum);
        
    }
}
