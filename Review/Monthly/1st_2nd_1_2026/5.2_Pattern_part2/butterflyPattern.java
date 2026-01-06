public class butterflyPattern {

    public static void main(String[] args) {
        int n = 4;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n*2; j++) {
                if(i>=j || j >= (n*2)-1-i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=n-1; i>=0; i--) {
            for(int j=n*2-1; j>=0; j--) {
                if(i>=j || j >= (n*2)-1-i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}