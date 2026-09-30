package DSA;
import java.util.HashMap;
public class MaxDuplicates {
    public static void main(String[] args) {
        int[] arr= {1, 2, 2, 3, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        for(int count : map.values()) {
            if(count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("Maximum Count " + maxCount);
    }
}