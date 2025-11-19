import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fist number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

        sc.close();

        double average = (a+b+c)/3;
        System.out.println("Average: "+ average);
        System.out.printf("%10f", average);
    }
}