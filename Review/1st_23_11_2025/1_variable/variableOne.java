import java.util.Scanner;

public class variableOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println("Average of this three number: "+ (a+b+c)/3);

    }
}