import java.util.Scanner;

public class functionOne {
    public static double avg(int parameterA, int parameterB, int parameterC) {
        return ((double)(parameterA + parameterB + parameterC) / 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number :");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number :");
        int num3 = sc.nextInt();

        sc.close();

        double average = avg(num1, num2, num3);
        System.out.println(average);
    }
}