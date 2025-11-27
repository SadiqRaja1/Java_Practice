import java.util.Scanner;

public class butterFly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        sc.close();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int start = n-1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++) {
        //         if(j<=start) {
        //             System.out.print(" ");
        //         }else {
        //             System.out.print("*");
        //         }
        //     }
        //     start--;
        //     System.out.println();
        // }
        int start = 1; int end = n*2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n*2; j++) {
                if(j>start && j<end) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            start++;
            end--;
        }

        start = 1;
        end = n*2;
        for(int i=1; i<=n; i++) {
            for(int j=n*2; j>=1; j--) {
                if(j>start && j<end) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }
}