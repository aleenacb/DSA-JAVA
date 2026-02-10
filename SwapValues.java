//Swap without using third variables
public class SwapValues {
    public static void SwapWithoutUsingThirdVariable(int [] values) {
        values[0] = values[0] - values[1];
        values[1] = values[1] + values[0];
        values[0] = values[1] - values[0];
    }
    public static void main(String[] args) {
        int []values = {7, 5};
        SwapWithoutUsingThirdVariable(values);
        System.out.println("Values of values[0]" + values[0] );
        System.out.println("Values of values[1]" + values[1]);
    }
}
