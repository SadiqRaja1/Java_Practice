public class stringOne {
    public static void main(String[] args) {
        String a = "Shaikh Sadiq Raja Sardar";

        System.out.println(count(a));
    }

    public static int count(String a) {
        int count = 0;
        for(int i=0; i<a.length(); i++) {
            if( a.charAt(i) == 'a'||
                a.charAt(i) == 'e'||
                a.charAt(i) == 'i'||
                a.charAt(i) == 'o'||
                a.charAt(i) == 'u' ) {
                    count++;
            }
        }
        return count;
    }
}
