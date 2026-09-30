package DSA;
import java.util.HashMap;
public class CountMaxNumOfDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 2, 4, 1, 1, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        int maxCount = 0;
        for(int count : map.values()) {
            if(count > maxCount) {
                maxCount = count;
            }
        }
        //int maxDuplicates = maxCount - 1;
        System.out.println("Maximum number of Duplicates : " + maxCount);
    }
}
//output: 4 //because 1 appears 4 times so output is 4