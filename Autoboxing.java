package DSA;
import java.util.ArrayList;
public class Autoboxing {
    public static void main(String[] args) {
        char ch = 'a';
        Character c = ch;
        System.out.println(c);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        System.out.println(list.get(0));
    }
}