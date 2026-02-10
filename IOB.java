package Error;
import java.util.Arrays;
public class IOB {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try
        {
            int value = array[3];
            System.out.println("Value" + value);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException"+e.getMessage());
        }
    }
}