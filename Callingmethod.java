public class Callingmethod {
    void hello() {
        System.out.println("This is user defined method");
    }
    public static void main(String [] args) {
        Callingmethod obj = new Callingmethod();
        obj.hello();
    }
}