import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char chars [] = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
        
    }
}

public class groupAnagrams {
    public static void main (String args []) {
        String str [] = {"act","pots","tops","cat","stop","hat"};

        Solution obj = new Solution();
        List<List<String>> result = obj.groupAnagrams(str);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
