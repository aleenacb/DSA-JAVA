package OOPS;
//Variable arguments with integer
public class VAI {
    static void fun(int... a) {
        System.out.println("Number of length : " + a.length);
        for(int i : a) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fun(100);
        fun(1, 2, 3, 4);
        fun();
    }
}
