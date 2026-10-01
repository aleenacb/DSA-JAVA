package OOPS;
public class ArraysPN {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        System.out.print("Primitive Array -> ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String[] names = {"Lakshit", "Rahul", "Pankaj","Mariya"};
        System.out.print("Non primitve Array -> ");
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
