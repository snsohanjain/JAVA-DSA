public class TheLargestSumOfTheArray {
    public static int findMaxSubarraySum(int[] nums) {
        int maxSum = nums[0];  // Initialize maxSum with the first element
        int currentSum = nums[0];  // Initialize currentSum with the first element

        for (int i = 1; i < nums.length; i++) {
            // Calculate the maximum sum ending at the current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int maxSum = findMaxSubarraySum(num);
        System.out.println("Largest sum of subarray: " + maxSum);
    }
}
