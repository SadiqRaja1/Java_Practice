import java.util.Scanner;

public class Tiangle01 {

    public static void printTri(int parameterA) {
        for(int i=1; i<=parameterA; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
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