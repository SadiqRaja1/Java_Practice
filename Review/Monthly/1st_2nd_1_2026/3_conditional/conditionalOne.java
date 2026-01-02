import java.util.Scanner;

public class conditionalOne {

    public static void checkNum (int parameterA) {
        if(parameterA < 0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is positive");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int a = sc.nextInt();

        sc.close();

        checkNum(a);
    }
}