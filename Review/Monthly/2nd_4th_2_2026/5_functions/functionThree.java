import java.util.Scanner;

public class functionThree {

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        sc.close();
        
        checkPalindrome(num);
    }

    public static void checkPalindrome(int num) {
        int helper = 0, copy = num;

        while (copy != 0) {
            helper = helper*10 + copy % 10;
            copy /= 10;
        }

        System.out.println(helper);
        if(helper == num) {
            System.out.println(num + " is Palindrome");
        }else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}