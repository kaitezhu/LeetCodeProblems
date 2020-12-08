package BinarySearch;

public class SearchA2DMatrix {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
//        arr[0][0] = 1;
//        arr[0][1] = 3;
//        arr[0][2] = 5;
//        arr[0][3] = 7;
//        arr[1][0] = 10;
//        arr[1][1] = 11;
//        arr[1][2] = 16;
//        arr[1][3] = 20;
//        arr[2][0] = 23;
//        arr[2][1] = 30;
//        arr[2][2] = 34;
//        arr[2][3] = 60;
        int[][] arr = new int[2][1];
        arr[0][0] = 1;
        arr[1][0] = 3;

        System.out.println(searchMatrix(arr, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else if (matrix[i][mid] > target) {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
