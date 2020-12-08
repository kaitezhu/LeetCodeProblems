package PatternsForCodingQuestions;

public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int result = findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2});
        int result2 = findMaxSumSubArraySliding(3, new int[]{2, 1, 5, 1, 3, 2});
        System.out.println("Result = " + result);
        System.out.println("New result = " + result2);
    }

    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i = 0; i < arr.length - k + 1; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static int findMaxSumSubArraySliding(int k, int[] arr) {
        int windowStart = 0;
        int windowSum = 0;
        int maxSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            // if we reach the limit of k
            if (windowEnd >= k) {
                maxSum = Math.max(windowSum, maxSum);
                // subtract and slide
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
