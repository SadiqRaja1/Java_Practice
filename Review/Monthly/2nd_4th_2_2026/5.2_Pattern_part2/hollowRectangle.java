public class hollowRectangle {

    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==1 || j ==0 || i==4 || j==4){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}