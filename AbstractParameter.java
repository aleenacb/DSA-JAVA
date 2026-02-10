public class AbstractParameter {
    public static void main(String[] args) {
        AbstractParameter obj = new AbstractParameter();
        obj.add(2,3);
        System.out.println("Aleena");
    }
    public void add(int a, int b) {
        int x = a;
        int y = b;
        int z = x + y;
        System.out.println("Sum = "+ z);
    }
}

