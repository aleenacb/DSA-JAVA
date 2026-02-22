//Calling with userdefined methods
public class UserDefined {
    void hello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        UserDefined obj = new UserDefined();
        obj.hello();
    }
}