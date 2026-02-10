abstract class Animal {
    abstract void check(String name);
}
public class AnimalEx extends Animal {
    void check(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        AnimalEx obj = new AnimalEx();
        obj.check("Aleena");
    }
}