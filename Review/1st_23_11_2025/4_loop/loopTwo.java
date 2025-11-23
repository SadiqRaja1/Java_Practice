import java.util.Scanner;

public class loopTwo {
    
    static int evenSum = 0;
    static int oddSum = 0;
    static int choice = 0;
    static int input ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(choice == 0) {
            System.out.print("Enter your number: ");

            input = sc.nextInt();
            if(input % 2 == 0) {
                evenSum += input;
            }else{
                oddSum += input;
            }

            System.out.println("Enter 0 to continue or 1 to stop");
            choice = sc.nextInt();

        }
        sc.close();

        System.out.println("Even sum is "+ evenSum);
        System.out.println("Odd sum is "+ oddSum);
    }
}