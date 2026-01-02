import java.util.Scanner;

public class conditionalOne {

    static boolean check(int parameterA) {
        return (parameterA >=0 ) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :");

        int input = sc.nextInt();
        sc.close();

        if(check(input)) {
            System.out.println("The given number Positive");
        }else {
            System.out.println("The given number Negative");
        }
    }
}