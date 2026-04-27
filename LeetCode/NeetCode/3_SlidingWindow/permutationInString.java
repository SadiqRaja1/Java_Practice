import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char s1Arr [] = s1.toCharArray();
        Arrays.sort(s1Arr);
        String s1Sorted = new String(s1Arr);

        for(int i=0; i<s2.length(); i++){
            for(int j=i; j<s2.length(); j++){
                String sub = new String(s2.substring(i, j+1));
                char subArr [] = sub.toCharArray();
                Arrays.sort(subArr);

                String subSorted = new String(subArr);

                if(subSorted.equals(s1Sorted)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkInclusionHashMap (String s1, String s2){
        if(s1.length() > s2.length()) return false;

        HashMap<Character, Integer> need = new HashMap<>();

        for(char ch : s1.toCharArray()){
            need.put(ch, need.getOrDefault(ch,0)+1);
        }

        int left = 0;
        int count = s1.length();

        for(int right = 0; right < s2.length(); right++){
            char rightChar = s2.charAt(right);

            if(need.containsKey(rightChar)) {
                if(need.get(rightChar) > 0) {
                    count--;
                } 
                need.put(rightChar, need.get(rightChar)-1);
            }

            if(right-left+1 > s1.length()){
                char leftChar = s2.charAt(left);

                if(need.containsKey(leftChar)) {
                    if(need.get(leftChar) >= 0){
                        count++;
                    }
                    need.put(leftChar, need.get(leftChar) +1);
                }

                left++;
            }

            if(count == 0){
                return true;
            }
        }

        return false;
    }
}


public class permutationInString {
    public static void main (String args [] ) {
        String s1 = "abc";
        String s2 = "lecabee";

        Solution obj = new Solution();

        System.out.println(obj.checkInclusionHashMap(s1, s2));
    }
}
