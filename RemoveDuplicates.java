package DSA;

public class RemoveDuplicates {
    public static int RemoveDuplicate(int[] arr) {
        int storeIndex = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                arr[storeIndex] = arr[i];
                storeIndex++;
            }
        }
        return storeIndex;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        System.out.println("After removing duplicates " + RemoveDuplicate(arr));
    }
}
