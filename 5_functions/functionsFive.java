import java.util.Scanner;

public class functionsFive {

    public static void addDigits(int parameterA) {
        int sum = 0;
        while (parameterA !=0) {
            sum += parameterA % 10;
            parameterA /=10;
        }
        System.out.println("The sum of the given numbers digits is : "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        addDigits(input);
    }
}