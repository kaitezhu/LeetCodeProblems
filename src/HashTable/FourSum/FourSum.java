package HashTable.FourSum;

import java.util.ArrayList;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        FourSum fs = new FourSum();
        List<List<Integer>> res = fs.fourSum(nums, target);
        for(List<Integer> ls : res) {
            for(int i : ls) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        return null;

    }
}
