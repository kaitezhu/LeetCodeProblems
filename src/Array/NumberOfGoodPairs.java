package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
//        int res = numIdenticalPairs(new int[]{1,2,3,1,1,3});
//        System.out.println();

        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs_v2(new int[]{101,101,101}));
    }


    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            } else {
                map.get(nums[i]).add(i);
            }
        }
        for (Map.Entry<Integer, ArrayList<Integer>> it : map.entrySet()) {
            int n = it.getValue().size();
            count += n * (n - 1) / 2;
        }
        return count;
    }

    public static int numIdenticalPairs_v2(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
}
