public class stringBasic {

    public static void main(String[] args) {
        /*
         * 1
         * String str = "abc"; // created in string pool
         * String str2 = new String("xyx");// created in heap memory
         * 
         * System.out.println(str);
         * System.out.println(str2);
         * 
         * str = "def";
         * str2 = "def";
         * System.out.println(str);
         * System.out.println(str2);
         * 
         */

        /*
         * 2 Concatenation and char at
         * String fistName = "Shaikh Sadiq Raja";
         * String lastName = "Sardar";
         * 
         * String fullName = fistName +" " + lastName;
         * 
         * System.out.println(fullName);
         * 
         * System.out.println(fullName.charAt(0));
         * 
         */

        /* 3 string palindrome check 

        String word = "madam";
        String word2 = "racecar";
        String word3 = "madam";
        String word4 = "moon";

        System.out.println(word.length());
        System.out.println(checkPalindrome(word));
        System.out.println(checkPalindrome(word2));
        System.out.println(checkPalindrome(word3));
        System.out.println(checkPalindrome(word4));
        */
        
    }

    public static boolean checkPalindrome(String word) {
        for (int i = 0; i <= (word.length() / 2); i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}