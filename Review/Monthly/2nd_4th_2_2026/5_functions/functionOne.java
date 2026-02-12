import java.util.Scanner;

public class functionOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1st number");
        int num1 = sc.nextInt();

        System.out.println("2nd number");
        int num2 = sc.nextInt();

        System.out.println("3rd number");
        int num3 = sc.nextInt();

        sc.close();
        
        Average(num1,num2,num3);
    }

    public static void Average(int a, int b, int c) {
        System.out.println((a+b+c)/3);
    }

}