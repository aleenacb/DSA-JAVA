public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] > arr[i - 1]) &&
                (i == arr.length - 1 || arr[i] > arr[i + 1])) {
                System.out.println("Peak: " + arr[i]);
                break;
            }
        }
    }
}
