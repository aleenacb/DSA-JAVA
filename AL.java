import java.util.ArrayList;
public class AL {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aleena");
        al.add("CSE");
        al.add("MITE");
        System.out.println("Original string" + al);
        al.add(1, "studing in");
        System.out.println("After adding index 1" + al);
        al.remove(1);
        System.out.println("After removing" + al);
        al.set(0, "aleena");
        System.out.println("After updation" + al);
    }
}