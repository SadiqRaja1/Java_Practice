public class firstMatchingCharacterFromBothEnds {
    public static void main (String args [] ) {
        String s = "abcacbd";

        System.out.println(firstMatching(s));
    }

    public static int firstMatching(String s) {
        int ans = -1;
        int n = s.length();

        for(int i=0; i<n; i++) {
            if (s.charAt(i) == s.charAt(n-i-1)) {
                ans = i;
                return ans;
            }
        }

        return ans;
    }
}