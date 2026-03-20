import java.util.Arrays;

public class validAnagram242 {

    public static void main(String[] args) {
        String s = "care";
        String t = "race";

        System.out.printf("%s %b", "Is Anagra", isAnagram(s,t));
        // System.out.println("is Anagram "+ isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }


        int count [] = new int[128];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)]++;
            // count[t.charAt(i)]--;
        }

        System.out.println(Arrays.toString(count));

        for(int num : count) {
            if (num != 0) return false;
        }

        return true;
    }
}