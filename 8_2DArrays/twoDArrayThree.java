import java.util.Arrays;

public class twoDArrayThree {

    public static void tranposeMatrix(int matrix [][]) {
        int tranposeMatrix [][] = new int [matrix[0].length] [matrix.length];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++){
                tranposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(tranposeMatrix));
    }
    public static void main(String[] args) {
        int Matrix [][] = {
                {1,2},
                {3,4},
                {5,6}
        };
        tranposeMatrix(Matrix);
    }
}