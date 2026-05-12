import java.util.*;
class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        List<Integer> set = new ArrayList<>();

        for(String s : strs){
            set.add(s.length());
        }

        for(int num : set){
            res.append(num).append(',');
        }

        res.append('#');

        for(String s : strs){
            res.append(s);
        }

        return res.toString();

    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        int i = 0;

        while (str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();

            while(str.charAt(i) != ',' && str.charAt(i) != '#'){
                sb.append(str.charAt(i));
                i++;
            }

            if(str.charAt(i) == ','){
                i++;
            }

            set.add(Integer.parseInt(sb.toString()));

        }

        i++;

        for(int num :  set) {
            ans.add(str.substring(i, i+num));
            i += num;
        }


        return ans;
    }
}

public class encodeAndDecodeStrings {
    public static void main (String args []) {
        List<String> strs = new ArrayList<>();

        strs.add("we");
        strs.add("say");
        strs.add(":");
        strs.add("yes");
        strs.add("!@#$%^&*()");

        System.out.println(strs);

        Solution obj = new Solution();

        String endcodedString = obj.encode(strs);
        System.out.println(endcodedString);

        System.out.println(obj.decode(endcodedString));

    }
}