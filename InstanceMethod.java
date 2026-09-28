package OOPS;

class Test {
    String n = "";
    public void test(String n) {
        this.n = n;
    }
}
public class InstanceMethod {
    public static void main(String[] args) {
        Test t = new Test();
        t.test("Aleena");
        System.out.println(t.n);
    }
}