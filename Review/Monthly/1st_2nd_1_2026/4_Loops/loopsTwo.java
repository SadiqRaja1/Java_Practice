import java.util.Scanner;

public class loopsTwo {

    public static void main(String[] args) {
        int choice = 0;
        int oddSum = 0; 
        int evenSum = 0;
        int input;

        Scanner sc = new Scanner(System.in);

        while (choice == 0) {

            System.out.println("Enter number :");
            input = sc.nextInt();

            if(input % 2 == 0) {
                evenSum += input;
            }else {
                oddSum += input;
            }

            System.out.println("To continue enter : '0'. To Stop Enter '1'");
            choice = sc.nextInt();
        }

        sc.close();

        System.out.println("Even Sum : " + evenSum);
        System.out.println("Odd Sum : " + oddSum);
    }
}