package OOPS;
//ArraysIndexOutOfBoundsException
public class AIOBE {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[3] = 30;
        arr[4] = 40;
        System.out.println("Trying to access element outside the size of array");
        System.out.println(arr[5]);
    }
}
