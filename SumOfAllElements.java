package DSA;

public class SumOfAllElements {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 8, 15};
        int sum = 0;
        for(int num : arr) {
        sum = num + sum;
        }
        System.out.println(sum);
    }
}
