import java.util.Arrays;

public class stringFour {

    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "care";


        System.out.println("str1 and str2 is anagram " + isAnagram(str1, str2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char a [] = s1.toCharArray();
        char b [] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}