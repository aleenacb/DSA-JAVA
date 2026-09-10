package DSA;
public class Frequency {
    public static void main(String[] args) {
        //To count how many times each elements present
        //Inner loop -> To traverse all the elements
        int arr[] = {2, 3, 2, 5, 3, 2, 4};
        for(int i = 0; i < arr.length;i++) {
            //check appeared elements is still repeating
            boolean alreadycounted = false;
            //to traverse all the elements to check whether repeated elements are there
            for(int k = 0; k < i; k++) {
                if(arr[k] == arr[i]) {
                    alreadycounted = true;
                }
            }
                if(alreadycounted) {
                    continue;
                }
            int count = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}