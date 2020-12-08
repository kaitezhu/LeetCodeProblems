package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        SmallerThanCurrentNumber smallerThanCurrentNumber = new SmallerThanCurrentNumber();
        System.out.println(Arrays.toString(smallerThanCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        // copy and sort the given array
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // if the key is absent, put key and value pair into map
        // value -> num of int that are smaller than the current val
        for (int i = 0; i < sorted.length; i++) {
            map.putIfAbsent(sorted[i], i);
        }

        // iterate the map, use nums to find corresponding val and copy it to new array
        for (int i = 0; i < nums.length ; i++) {
            res[i] = map.get(nums[i]);
            System.out.println(map.get(nums[i]));
        }
        return res;
    }
}
