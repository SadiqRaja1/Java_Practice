import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int res = 0;

        int l=0;
        int maxf = 0;

        for(int r=0; r<n; r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);{

                maxf = Math.max(maxf, map.get(s.charAt(r)));

                while((r-l + 1) - maxf > k) {
                    map.put(s.charAt(l), map.get(s.charAt(l))-1);
                    l++;
                }
                
                res = Math.max(res, r-l+1);
            }
        }

        return res;
        
    }
}
public class longestRepeatingCharacterReplacement {
    public static void main (String args []) {
        
        String s = "ABAB";
        String s1 = "AABABBA";
        
        Solution obj = new Solution();

        System.out.println(obj.characterReplacement(s, 2));
        System.out.println(obj.characterReplacement(s1, 1));

    }

}