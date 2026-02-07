import java.util.Scanner;

public class loopsTwo {

    public static void main(String[] args) {
        int evenSum = 0; 
        int oddSum = 0;

        Scanner sc = new Scanner(System.in);
        
        int helper = 0;

        while(helper == 0){
            System.out.println("Enter number : ");
            int num = sc.nextInt();

            if(num % 2 == 0) {
                evenSum += num;
            }else {
                oddSum += num;
            }

            System.out.println("for continue press 0. To end press 1");
            helper = sc.nextInt();
        }

        sc.close();

        System.out.println("Even Sum is "+ evenSum + " Odd Sum is "+ oddSum);
    }
}