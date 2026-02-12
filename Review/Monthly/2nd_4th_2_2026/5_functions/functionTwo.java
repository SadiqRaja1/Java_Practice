import java.util.Scanner;

public class functionTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        sc.close();
        System.out.println(isEven(num));
    }

    public static boolean isEven(int num) {
        return num % 2==0 ? true : false;
    }
}