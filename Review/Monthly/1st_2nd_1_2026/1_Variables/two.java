import java.util.Scanner;

public class two {

    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of the square: ");
        int side = sc.nextInt();

        sc.close();

        System.out.println("Area of square :" + side * side);
    }
}