package OOPS;
//Variable with other arguments
public class VWOA {
    static void fun2(String s, int... a) {
        System.out.println("String : " + s);
        System.out.println("Number of length : " + a.length);
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fun2("Aleena", 22);
        fun2("Kerala", 15, 57123);
        fun2("Pathnamthitta");
    }
}
