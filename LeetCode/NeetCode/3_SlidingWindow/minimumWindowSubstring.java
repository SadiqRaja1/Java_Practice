import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        String answer = "";

        HashMap<Character, Integer> need = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int minWin = 0;

        for (int i = 0; i < s.length(); i++) {

            int count = t.length();
            HashMap<Character, Integer> helper = new HashMap<>(need);

            if (helper.containsKey(s.charAt(i))) {
                for (int j = i; j < s.length(); j++) {
                    char currCh = s.charAt(j);

                    // count update and hashmap check and update
                    if (helper.containsKey(currCh)) {
                        if (helper.get(currCh) > 0) {
                            count--;
                            helper.put(currCh, helper.get(currCh) - 1);
                        } else {
                            helper.put(currCh, helper.get(currCh) - 1);
                        }
                    } else {
                        continue;
                    }

                    if (count == 0) {
                        if (minWin == 0) {
                            minWin = (j - i) + 1;
                            answer = s.substring(i, j + 1);
                        } else if (minWin > (j - i) + 1) {
                            minWin = (j - i) + 1;
                            answer = s.substring(i, j + 1);
                        }
                    }
                }
            }

        }
        return answer;
    }

    public String minWindowOpti(String s, String t) {
        String answer = "";

        HashMap<Character, Integer> helper = new HashMap<>();

        for (char ch : t.toCharArray()) {
            helper.put(ch, helper.getOrDefault(ch, 0) + 1);
        }

        int minWin = Integer.MAX_VALUE;
        int left = 0;

        int count = t.length();

        for (int right = 0; right < s.length(); right++) {
            char currCh = s.charAt(right);

            // count update and hashmap check and update
            if (helper.containsKey(currCh)) {
                if (helper.get(currCh) > 0) {
                    count--;
                    helper.put(currCh, helper.get(currCh) - 1);
                } else {
                    helper.put(currCh, helper.get(currCh) - 1);
                }
            }

            while (count == 0) {
                if (minWin > (right - left) + 1) {
                    answer = s.substring(left, right + 1);
                    minWin = (right - left) + 1;
                }

                char lCh = s.charAt(left);
                if (helper.containsKey(lCh)) {
                    helper.put(lCh, helper.get(lCh) + 1);

                    if (helper.get(lCh) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        return answer;
    }
}

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String s1 = "aaaaaaaaaaaabbbbbcdd";
        String t1 = "abcdd";

        Solution obj = new Solution();

        System.out.println(obj.minWindowOpti(s1, t1));
    }
}
