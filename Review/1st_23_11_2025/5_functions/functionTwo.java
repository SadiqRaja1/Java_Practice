import java.util.Scanner;

public class functionTwo {

    public static boolean isEven (int parameterA) {
        return (parameterA % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int input = sc.nextInt();

        sc.close();

        System.out.println("Is Even : " + isEven(input));
        System.out.println("4 is Even :"+ isEven(4));
        System.out.println("9 is Even :"+ isEven(9));
        System.out.println("99 is Even :" +isEven(99));
        System.out.println("2000 is Even :"+ isEven(2000));
    }
}