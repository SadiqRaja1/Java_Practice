import java.util.Scanner;

public class hollowRectangle {

    static void printHollow (int n){
        for(int i=1;i<n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n-1 || j==1 || j==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        /* it's working but below is advanced one */
        // for(int i=1; i<=5; i++) {
        //     if(i==2 || i == 3 || i == 4) {
        //         for(int j=1; j<=5; j++) {
        //             if(j==1 || j ==5) {
        //                 System.out.print("*");
        //             }else {
        //                 System.out.print(" ");
        //             }
        //         }
        //     }else {
        //         for(int j=1;j<=5; j++) {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how much star hollow rectangle you want ?: ");
        int n = sc.nextInt();
        sc.close();

        printHollow(n);
    }

    
}