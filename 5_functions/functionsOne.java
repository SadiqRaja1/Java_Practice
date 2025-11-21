import java.util.Scanner;

public class functionsOne {
    public static int average(int parameterA, int parameterB, int parameterC) {
        return (parameterA+parameterB+parameterC)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println("Average of this three number is : "+ average(a, b, c));
    }
}