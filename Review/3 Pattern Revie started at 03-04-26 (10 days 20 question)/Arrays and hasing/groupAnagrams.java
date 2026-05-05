import java.util.*;

class Solution {
    public List<List<String>> printGroupAnagrams (String str [] ) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : str) {
            char ch [] = s.toCharArray();
            Arrays.sort(ch);

            String chString = new String(ch);

            if(!map.containsKey(chString)) {
                map.put(chString, new ArrayList<>());
            }

            map.get(chString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

public class groupAnagrams {
    public static void main(String[] args) {
        String str [] = {"act","pots","tops","cat","stop","hat"};

        Solution obj = new Solution();

        List<List<String>> result = obj.printGroupAnagrams(str);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}