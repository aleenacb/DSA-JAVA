package DSA;

import java.util.ArrayList;
public class Unboxing {
    public static void main(String[] args) {
        Character ch = 'a';
        char c = ch;
        System.out.println(c);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        int num = list.get(0);
        System.out.println(num);
    }
}
