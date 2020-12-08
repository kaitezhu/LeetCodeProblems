package BinarySearch;

public class NumberRange {
    public static void main(String[] args) {
        int[] res = new int[2];
        res[0] = findFirst(new int[]{4,6,6,6,9}, 6);
        res[1] = findLast(new int[]{4,6,6,6,9}, 6);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int findFirst(int[] arr, int key) {
        int idx = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key <= arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            }
            if (key == arr[mid]) {
                idx = mid;
            }
        }
        return idx;
    }

    public static int findLast(int[] arr, int key) {
        int idx = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key >= arr[mid]) {
                left = mid + 1;
            } else if (key < arr[mid]) {
                right = mid - 1;
            }
            if (key == arr[mid]) {
                idx = mid;
            }
        }
        return idx;
    }
}
