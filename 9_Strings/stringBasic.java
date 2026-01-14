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

        /*
         * 3 string palindrome check
         * 
         * String word = "madam";
         * String word2 = "racecar";
         * String word3 = "madam";
         * String word4 = "moon";
         * 
         * System.out.println(word.length());
         * System.out.println(checkPalindrome(word));
         * System.out.println(checkPalindrome(word2));
         * System.out.println(checkPalindrome(word3));
         * System.out.println(checkPalindrome(word4));
         */

        /*
         * 4 String compare functions
         * String s1 = "Tony";
         * String s2 = "Tony";
         * String s3 = new String("Tony");
         * 
         * System.out.println(s1 == s2);
         * System.out.println(s1.equals(s2));
         * 
         * System.out.println(s1 == s3); // it's check object
         * System.out.println(s1.equals(s3)); // it's check only value
         * 
         */

        /* 4 String substring functions 
        String fruits[] = { "apple", "mango", "banana" };

        System.out.println(fruits[findLargest(fruits)]);

        */

        /*5 Compare to
        String s1 = "apple";
        String s2 = "apple";
        String s3 = "APPLE";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s3));


        */

        //StringBuilder ->

        //a
        /* 
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        */
        /* b 
        sb.delete(0,sb.length());
        System.out.println(sb);
        */


        /* 6 

        int a = 2;
        Integer aI = 2;
        // System.out.println(a.toString()); //notwork

        System.out.println(aI.toString()); // it will work
        */

        String name = "hello world";
        String sentence = "hi i am sadiq";

        System.out.println(changeFirstCharCap(name));
        System.out.println(changeFirstCharCap(sentence));

    }

    public static String changeFirstCharCap(String name) {
        StringBuilder sbName = new StringBuilder(name);

        sbName.setCharAt(0, Character.toUpperCase(sbName.charAt(0)));

        for(int i=0; i<sbName.length(); i++){
            if(sbName.charAt(i) == ' ') {
                sbName.setCharAt(i+1, Character.toUpperCase(sbName.charAt(i+1)));
            }
        }
       return sbName.toString();
    }

    public static int findLargest(String fruits[]) {
        int largestInx = 0;
        for (int i = 0; i < fruits.length; i++) {
            largestInx = fruits[largestInx].length() > fruits[i].length()? largestInx : i;
        }
        return largestInx;
    }

    public static boolean checkPalindrome(String word) {
        for (int i = 0; i <= (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}