import java.util.Scanner;

public class loopThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get it factorial: ");
        int input = sc.nextInt();
        sc.close();

        int fact = 1;

        for(int i = input; i>0; i--) {
            fact *= i;
        }

        System.out.println("The factorial of "+input+" is " + fact);
    }
}