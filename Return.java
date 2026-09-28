package Jump;

public class Return {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[]args) {
        int result = calculateSum(10, 20);
        System.out.println("result : " + result);

    }
}
