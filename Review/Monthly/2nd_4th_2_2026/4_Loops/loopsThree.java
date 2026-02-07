import java.util.Scanner;

public class loopsThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        sc.close();

        System.out.println(factPrint(num));
    }

    public static int factPrint(int num) {
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *=i;
        }

        return fact;
    }
}