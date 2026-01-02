import java.util.*;

public class loopsThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int input = sc.nextInt();

        sc.close();

        int factorial = 1;
        for(int i=1; i<=input; i++) {
            factorial *= i;
        }

        System.out.println(input + "! factorial is : "+ factorial);
    }
}