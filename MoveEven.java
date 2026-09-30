package DSA;

public class MoveEven {
    public static void main(String[] args) {
        int arr[] = {3, 8, 5, 2, 7, 4, 1, 6};
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if(arr[left] % 2 == 0) {
                left++;
            }
            else if(arr[right] % 2 != 0){
                right--;
            } 
            else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
