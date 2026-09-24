package DSA;

public class CallingUserDefinedMethod {
    void hello() {
        System.out.println("This is a user-defined method");
    }
    public static void main(String[] args) {
        CallingUserDefinedMethod obj = new CallingUserDefinedMethod();
        obj.hello();
    }
}
