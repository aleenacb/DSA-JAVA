package Error;
import java.util.ArrayList;
import java.util.LinkedList;
public class Collections {
   public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    l1.add(100);
    l1.add(200);
    l1.add(300);
    System.out.println(" "+ l1);
    ArrayList<Integer>l2 = new ArrayList<>();
    l2.add(400);
    l2.add(500);
    l1.addAll(1,l2);
    System.out.println(" "+l1);
   } 
}
