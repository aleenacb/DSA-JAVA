package Error;
import java.util.LinkedList;
public class AA {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Aleena");
        l1.add("CSE-Batch");
        l1.add("MITE");
        System.out.print(l1);
        LinkedList<String> l2 = new LinkedList<>();
        l2.add("1");
        System.out.print(l2);
        l1.addAll(l2);
        System.out.print(l1);
    }
}