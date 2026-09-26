package Methods;

class StaticMethod {
    static void hello() {
        System.out.println("Hello");
    }
}
public class CallingStaticMethod {
    public static void main(String[] args) {
        StaticMethod.hello();
    }
}
