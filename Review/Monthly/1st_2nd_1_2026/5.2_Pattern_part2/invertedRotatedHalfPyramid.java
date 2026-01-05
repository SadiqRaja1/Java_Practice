public class invertedRotatedHalfPyramid {

    public static void main(String[] args) {
        int n = 4;
        int count = n-1;

        for(int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if(j >= count) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            count--;
        }
    }
}