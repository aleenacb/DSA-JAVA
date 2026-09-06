package DSA;
import java.util.Queue;
import java.util.LinkedList;
public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("g");
        queue.add("f");
        queue.add("g");
        System.out.println("Initial Queue: " + queue);
        System.out.println("Dequeue: " + queue.remove());
        System.out.println("After deque: " + queue);
    }
}
