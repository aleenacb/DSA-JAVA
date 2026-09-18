package DSA;
import java.util.PriorityQueue;
public class HeapEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(6);
        minHeap.add(7);
        System.out.println("Heap: " + minHeap);
        System.out.println("Smallest element " + minHeap.poll());
        System.out.println("Heap after poll " + minHeap);
    }
}
