package BinarySearch;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] res = new int[2];
        res[0] = findFirst(new int[]{5,7,7,8,8,10}, 8);
        res[1] = findLast(new int[]{5,7,7,8,8,10}, 8);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (int) Math.floor((left + right) * 0.5);
            if (nums[mid] == target) {
                res[0] = mid;
                for (int i = mid + 1; i < nums.length; i++) {
                    System.out.println("i === " + i);
                    if (nums[i] == target) {
                        res[1] = i;
                    }
                }
                return res;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static int findFirst(int[] nums, int target) {
        int idx = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }

    public static int findLast(int[] nums, int target) {
        int idx = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
}
