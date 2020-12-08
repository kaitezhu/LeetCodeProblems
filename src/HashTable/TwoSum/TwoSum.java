package HashTable.TwoSum;

import java.util.HashMap;

//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] res = new int[2];
//        for(int i = 0; i < nums.length; i++){
//            int diff = target - nums[i];
//            if(map.containsKey(diff)){
//                res[0] = i;
//                res[1] = map.get(diff);
//                return res;
//            }
//            map.put(nums[i], i);
//        }
//        return null;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,5};
        int target = 9;
        int[] res = twoSum(nums, target);
        for(int i : res) {
            System.out.println("num = " + i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                res[0] = i;
                res[1] = map.get(diff);
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
