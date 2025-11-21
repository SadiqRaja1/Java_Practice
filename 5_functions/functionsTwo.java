import java.util.Scanner;

public class functionsTwo {

    static boolean isEven(int parameterA) {
        return (parameterA %2 == 0) ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();
        sc.close();

        if (isEven(a)){
            System.out.println("The input number is Even");
        }else {
            System.out.println("The given number is odd");
        }
    }
}