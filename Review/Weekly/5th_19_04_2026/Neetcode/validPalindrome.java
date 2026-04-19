class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start =0;
        int end = s.length()-1;

        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
}

public class validPalindrome {
    public static void main (String args []) {
        String str = "Was it a car or a cat I saw?";

        Solution obj = new Solution();

        System.out.print(obj.isPalindrome(str));
    }
}