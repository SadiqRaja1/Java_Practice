import java.util.Scanner;

public class functionFive {
    static int digiSum (int parameterA) {
        int reverse = parameterA;
        int sum = 0;

        while (reverse !=0) {
            int remainder = reverse % 10;
            sum += remainder;

            reverse /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int input = sc.nextInt();

        sc.close();

        System.out.println(input+ " digit sum is "+ digiSum(input));
    }
}