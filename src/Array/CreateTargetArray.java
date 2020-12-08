package Array;

import java.util.*;

public class CreateTargetArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})));
        System.out.println(Arrays.toString(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = a.get(i);
        }
        return target;
    }
}
