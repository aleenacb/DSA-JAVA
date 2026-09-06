package DSA;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SortingAlg {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1};
        Arrays.sort(nums);
        System.out.println("Sorted Array " + Arrays.toString(nums));
        //List ex
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
