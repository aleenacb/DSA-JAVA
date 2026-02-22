import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[][] indexedNums = new int[nums.length][2];

        // Store the numbers along with their original indices
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i]; // Value
            indexedNums[i][1] = i;       // Original Index
        }

        // Sort based on the values
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        // Two-pointer approach
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];

            if (sum == target) {
                return new int[]{indexedNums[left][1], indexedNums[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(nums1, target1))); // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2))); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3))); // Output: [0, 1]
    }
}

