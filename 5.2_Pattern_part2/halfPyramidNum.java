import java.util.Scanner;

public class halfPyramidNum {

    public static void printPyramid(int parameterA) {
        for(int i = 0; i<parameterA; i++) {
            for (int j=1; j<=parameterA-i; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        
        int n = sc.nextInt();
        sc.close();
        printPyramid(n);
    }
}