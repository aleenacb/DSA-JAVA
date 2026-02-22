public class text {
    String n = "";
    public void text(String n) {
        this.n = n;
    }
}
class Instance {
public static void main(String [] args) {
    text t = new text();
    t.text("geek for geeks");
    System.out.println(t.n);
}
}