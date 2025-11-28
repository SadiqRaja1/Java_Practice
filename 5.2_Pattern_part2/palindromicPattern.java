public class palindromicPattern {

    public static void main(String[] args) {
        int n = 5;

        int count = 2;
        for(int i = 1; i<=5; i++) {
            for(int j=n; j>=i+1; j--) {
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(count-j+ " ");
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            count++;
        }
    }
}