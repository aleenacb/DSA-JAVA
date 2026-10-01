package OOPS;

public class UpdateArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 12};
        //Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);
        //Traversing the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
