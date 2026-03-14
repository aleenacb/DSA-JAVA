public class Object {
    String name;
    String age;
    Object(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Object obj = new Object("Aleena","20");
        System.out.println(obj.toString());
    }
}