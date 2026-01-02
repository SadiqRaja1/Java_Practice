import java.util.Scanner;

public class one {

    public static double Average(int parameterA, int parameterB, int parameterC) {
        return (parameterA + parameterB + parameterC) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number :");
        int a = sc.nextInt();

        System.out.println("Enter your 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Enter your 3rd number :");
        int c = sc.nextInt();

        sc.close();

        System.out.println(Average(a,b,c));
    }
}