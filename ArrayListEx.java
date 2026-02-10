import java.util.Stack;
import java.util.Iterator;
class ArrayListEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Aleena");
        stack.push("VHjjvn");
        stack.push("dfnjdn");
        stack.push("dfdjvjd");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}