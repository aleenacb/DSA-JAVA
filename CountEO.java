package DSA;
//Count even and odd numbers
public class CountEO {
    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 8, 15, 7, 12};
        int even = 0;
        int odd = 0;
        for(int num: arr) {
            if (num % 2 == 0) {
                even++;
            } else  {
                odd++;
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}