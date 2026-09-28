package OOPS;
//Class is a blueprint or template for creating objects
public class ClassEx {
    String name;
    int age;
    void study() {
        System.out.println("Student is studying");
    }
    public static void main(String[] args) {
        ClassEx obj = new ClassEx();
        obj.study();
    }
}
