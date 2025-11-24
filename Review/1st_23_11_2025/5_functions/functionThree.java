import java.util.Scanner;

public class functionThree {

    public static boolean isPalindrome (int parameterA) {
        int copy = parameterA;
        int reverse = 0;

        while (copy != 0) {
            int remainder = copy % 10;

            reverse = reverse*10 + remainder;

            copy /= 10;
        }
        return (parameterA == reverse) ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int input = sc.nextInt();

        sc.close();

        if(isPalindrome(input)) {
            System.out.println(input + " is Palindrome");
        }else {
            System.out.println(input + " not a palindrome");
        }
    }
}