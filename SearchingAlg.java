package DSA;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class SearchingAlg {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        int key = 6;
        //linear search
        System.out.println("Linear Search " +list.contains(key));
        //Binary Search using Collections.binary Search
        int index = Collections.binarySearch(list, key);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
