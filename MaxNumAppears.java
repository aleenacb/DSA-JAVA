package DSA;
import java.util.HashMap;
public class MaxNumAppears {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {2, 2, 1, 3, 2, 1, 4, 1, 1};
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        int maxCount = 0;
        int maxNumber = 0;
        for(int num : map.keySet()) {
            if(map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxNumber = num;
            }
        }
        System.out.println("Number appearing most = " + maxNumber);
    }
}
