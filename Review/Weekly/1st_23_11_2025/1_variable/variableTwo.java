import java.util.Scanner;

public class variableTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of square: ");

        int side = sc.nextInt();
        sc.close();

        System.out.println("Area of squre : "+ side*side);
    }
}