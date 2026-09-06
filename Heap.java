package DSA;
import java.util.PriorityQueue;
public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(1);
        minHeap.add(4);
        minHeap.add(6);
        System.out.println("Heap " + minHeap);
        System.out.println("Smallest element " + minHeap.poll());
        System.out.println("Heap after poll " + minHeap);
    }
}
