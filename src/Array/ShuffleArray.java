package Array;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(1/2);
    }
    // if num equals even, use the first half of array; else use the other half
    public static int[] shuffle(int[] nums, int n) {
        int[] res= new int[2 * n];
        for (int i = 0; i < nums.length ; i++) {
            res[i] = (i % 2) == 0 ? nums[i/2] : nums[n + i/2];
        }
        return res;
    }

    public static int[] shuffle_v2(int[] nums, int n) {
        int[] res= new int[2*n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i]; //even
            res[2 * i + 1] = nums[n + i]; //odd
        }
        return res;
    }
}
