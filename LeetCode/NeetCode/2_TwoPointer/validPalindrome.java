public class validPalindrome {
    public static void main (String args []) {
        String s = "Was it a car or a cat I saw?";

        System.out.println(checkPalindrome(s));

    }

    public static boolean checkPalindrome(String s ) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}