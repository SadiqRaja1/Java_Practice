import java.util.Scanner;

public class hollowRhombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i<=n; i++) {
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}