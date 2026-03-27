public class validAnagram {

    public static void main (String args []) {
        String s = "racecar";
        String t = "carrace";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int check [] = new int[160];

        for(int i=0; i<s.length(); i++) {
            check[s.charAt(i)]++;
            check[t.charAt(i)]--;
        }

        for(int index : check) {
            if(index != 0) {
                return false;
            }
        }
        return true;
    }
}