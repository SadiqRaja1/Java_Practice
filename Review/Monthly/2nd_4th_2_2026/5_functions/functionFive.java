import java.util.Scanner;

public class functionFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();

        sc.close();

        System.out.println(sumInteger(num));
    }

    public static int sumInteger(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;

            num /= 10;
            
        }
                
        return sum;
    }
}