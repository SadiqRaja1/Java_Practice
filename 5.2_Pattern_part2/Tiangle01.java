import java.util.Scanner;

public class Tiangle01 {

    public static void printTri(int parameterA) {
        int num = 0;
        for(int i = 0; i<parameterA; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num = (num==0) ? 1 :0;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        sc.close();

        printTri(n);
    }
}