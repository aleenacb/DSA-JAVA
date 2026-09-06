package DSA;

public class StringEx {
    public static void main(String[] args) {
        //Immutable String
        String s = "Hello! World";
        System.out.println(s);
        //Mutable StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Geeks");
        System.out.println(sb.toString());
    }
}
