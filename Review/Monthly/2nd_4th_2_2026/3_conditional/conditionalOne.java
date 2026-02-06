import java.util.Scanner;

public class conditionalOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");

        int a = sc.nextInt();

        sc.close();
        if(checkNum(a)) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }
    }

    public static boolean checkNum (int a) {
        return a < 0;
    }
}