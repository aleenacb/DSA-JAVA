package DSA;
//without use of array.sort method
public class WSM {
    public static void main(String[] args) {
        int arr[] = {50, 20, 30, 10, 40};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                while(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            for(int num:arr) {
                System.out.print(num + " ");
            }
        
    }
}
