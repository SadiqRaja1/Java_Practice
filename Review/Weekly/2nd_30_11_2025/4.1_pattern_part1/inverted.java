import java.util.Scanner;

public class inverted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}