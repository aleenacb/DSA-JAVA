public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start++];
            }

            if (sum == target) {
                System.out.println("Subarray found from " + start + " to " + end);
                break;
            }
        }
    }
}
