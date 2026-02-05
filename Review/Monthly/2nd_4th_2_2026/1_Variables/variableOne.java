import java.util.*;

public class variableOne {
    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a = sc.nextInt();
        System.out.println("Enter 2nd num");
        int b = sc.nextInt();
        System.out.println("Enter 3rd num");
        int c = sc.nextInt();

        sc.close();


        System.out.println("The average of there number is : " + (a+b+c)/3);
    }
}