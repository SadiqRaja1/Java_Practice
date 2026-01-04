public class functionsThree {

    public static void isPalindrome (int parameterNum) {
        int duplicate = parameterNum;
        int reverse = 0;;

        while(duplicate > 0) {
            reverse *=10;
            reverse = reverse+(duplicate % 10);
            duplicate /= 10; 
        }

        if(reverse == parameterNum) {
            System.out.println(parameterNum + " is a Palindrome number");
        }else {
            System.out.println(parameterNum + " is not a Palindrome number");
        }
    }
    public static void main(String[] args) {
        int num = 121;
        int num2 = 122;

        isPalindrome(num);
        isPalindrome(num2);
    }
}