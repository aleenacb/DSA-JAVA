public class SwapMain {
    public static void main(String[] args) {
        int a = 4, b = 5;
        System.out.println("Before swapping value" + a);
        System.out.println("Before swapping value " + b);
        a = (a + b) - (b = a);
        System.out.println("After swapping value " + a);
        System.out.println("After swapping value " + b);
    }    
}
