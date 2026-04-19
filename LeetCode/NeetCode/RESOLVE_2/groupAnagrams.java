import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> printGroupAnagrams(String[] strs) {
        HashMap<String, List<String>> reference = new HashMap<>();

        for(String s : strs) {
            char ch [] = s.toCharArray();
            Arrays.sort(ch);
            String check = new String(ch);
            if(reference.containsKey(check)) {
                reference.get(check).add(s);
            }else{
                List<String> st = new ArrayList<>();
                st.add(s);
                reference.put(check, st);
            }
        }

        return new ArrayList<>(reference.values());
    }
}

public class groupAnagrams {
    public static void main (String args []) {
        String str [] = {"act","pots","tops","cat","stop","hat"};

        Solution obj = new Solution();

        System.out.print(obj.printGroupAnagrams(str));
    }
}