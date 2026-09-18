package DecisionMaking;

public class NesterIfStatement {
    public static void main(String[] args) {
        int i = 10;
        if(i < 15) {
            System.out.println("i is smaller than 15");
            if(i == 10) {
                System.out.println("i is exactly equal to 10");
            }
        }
    }
}
