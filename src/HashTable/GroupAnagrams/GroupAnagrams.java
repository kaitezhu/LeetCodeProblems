package HashTable.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        // eat tea ate
        // tan nat
        // bat
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String term : strs) {
            char[] termArr = term.toCharArray();
            Arrays.sort(termArr);
            String termStr = String.valueOf(termArr);
            if(map.containsKey(termStr)) {
                map.get(termStr).add(term);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(term);
                map.put(termStr, temp);
            }
        }
        return new ArrayList<List<String>>(map.values());
//
    }
}
