import java.util.Scanner;

public class conditionalOne {

    static boolean checkNum(int a) {
        return (a >= 0) ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int number = sc.nextInt();
        sc.close();

        if (checkNum(number)){
            System.out.println(number + " this is a positive number");
        }else {
            System.out.println(number + " this is a negative number");
        }

    }
}