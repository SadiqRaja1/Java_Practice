import java.util.Arrays;
import java.util.Scanner;

public class StringFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string: ");
        String a = sc.next();
        System.out.println("enter second string: ");
        String b = sc.next();

        sc.close();
        checkAnagram(a, b);

    }

    public static void checkAnagram(String a, String b) {
        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            return;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char aArray[] = a.toCharArray();
        char bArray[] = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        if(Arrays.equals(aArray, bArray)) {
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}