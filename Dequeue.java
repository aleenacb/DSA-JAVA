package DSA;
import java.util.ArrayDeque;
public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<String> dequeStack = new ArrayDeque<>();
        dequeStack.push("g");
        dequeStack.push("f");
        dequeStack.push("h");
        System.out.println("Initial DequeStack : " + dequeStack);
        System.out.println("DequeStack : " + dequeStack.pop());
        System.out.println("After poping DequeStack : " + dequeStack);        
    }
}
