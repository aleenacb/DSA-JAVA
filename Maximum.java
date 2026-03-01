import java.util.Arrays;
public class Maximum {
    // Function to find the second Maximum element in the array
    static int getSecondMaximum(int[] arr) {
        int n = arr.length;

        int Maximum = -1, SecondMaximum = -1;

        // Finding the Maximum element
        for (int i = 0; i < n; i++) {
            if (arr[i] > Maximum)
                Maximum = arr[i];
        }

        // Finding the second Maximum element
        for (int i = 0; i < n; i++) {
            if (arr[i] > SecondMaximum && arr[i] != Maximum) {
                SecondMaximum = arr[i];
            }
        }
        return SecondMaximum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 30, 1};
        System.out.println(getSecondMaximum(arr));
    }
}

