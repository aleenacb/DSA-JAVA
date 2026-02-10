//Private access modifier
class AM {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class AMPrivate {
    public static void main(String[] args) {
        AM obj = new AM();
        obj.setName("Aleena");
        System.out.println("Hello " + obj.getName() + "! "+" Welcome to Java Program");
    }
}