import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the squear:");
        int side = sc.nextInt();

        sc.close();

        System.out.println("Area of the suquare is: "+ Math.pow(side, 2));
    }
}
