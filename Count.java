package DSA;

public class Count {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 40, 20};
        int count = 0;
        for(int num:arr) {
            if (num == 10) {
                count++;
            }
        }
        System.out.println("Count occurences : " + count);
    }
}
