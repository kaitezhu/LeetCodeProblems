package HashTable.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        LongestSubstring ls = new LongestSubstring();
        int res = ls.lengthOfLongestSubstring(s);
        System.out.println("Result = " + res);
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
}
