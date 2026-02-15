import java.lang.Math;
public class Circumference {
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        double radius = 4.0;
        double cir = circumference(radius);
        System.out.println(cir);
    }
}
