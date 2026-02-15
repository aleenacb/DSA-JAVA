public class Compiler {
    public static void main(String[] args) {
      int a = 20, b = 10, c = 0;
      a = b++ +c;
      System.out.println("Value of a(b + c), " + "b(b + 1), c = " + a + " , " + b + " , " + c);
    }
}   
