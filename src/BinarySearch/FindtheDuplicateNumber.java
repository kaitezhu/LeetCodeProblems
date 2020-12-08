package BinarySearch;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }

    public static int findDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int count = 0;
            int mid = left + (right - left) / 2;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
