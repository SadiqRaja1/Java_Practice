import java.util.Scanner;

public class loopsTwo {

    static int evenSum = 0;
    static int oddSum = 0;
    static int choice = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (choice == 0) {
            System.out.print("Enter your number: ");

            int input = sc.nextInt();

            if(input%2 == 0) {
                evenSum += input;
            }else {
                oddSum += input;
            }

            System.out.println("You want to continue? (0 for yes, 1 for no)");
            choice = sc.nextInt();
        }

        sc.close();
        System.out.println("Even sum : " + evenSum);
        System.out.println("Odd sum : " + oddSum);
        

    }
}