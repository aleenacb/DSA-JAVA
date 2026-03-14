import java.lang.reflect.Method;
public class Private { 
    private void private_method() {
        System.out.println("Private method " + "called from outside");
    }
    public void printData() {
        System.out.println("Public method");
    }
}
class Private {
    public static void main(String [] args) {
        throws Exception {
            Private p = new Private();
            Method m = check.class.getDeclaredMethod("private_method");
            m.setAccessible(true);
            m.invoke(p);
        }
    }
}
