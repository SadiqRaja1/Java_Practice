import java.util.Scanner;

public class floydsTriangle {

    public static void printfloyds(int parameterA) {
        int counter = 1;
        for(int i=0; i<parameterA; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        sc.close();

        printfloyds(n);
    }
}
