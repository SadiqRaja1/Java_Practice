import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagramsCheck(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char ch [] = s.toCharArray();
            Arrays.sort(ch);

            String sortedWord = new String(ch);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(s);

        }

        return new ArrayList<>(map.values());
    }
}
public class groupAnagram {
    public static void main (String args []) {
        String strs []= {"act","pots","tops","cat","stop","hat"};

        Solution obj = new Solution();

        System.out.println(obj.groupAnagramsCheck(strs));
    }
}
