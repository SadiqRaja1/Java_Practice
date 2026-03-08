import java.util.Arrays;

public class twoDthree {

    public static void main(String[] args) {
        int nums [][] = {
            {1,2},
            {3,4},
            {5,6}
        };

        transpose(nums);
    }

    public static void transpose(int nums[][]) {
        int numsTranspose [][]= new int[nums[0].length][nums.length];

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[0].length; j++) {
                numsTranspose[j][i] = nums[i][j];
            }
        }

        for(int i=0; i<numsTranspose.length; i++) {
            System.out.println(Arrays.toString(numsTranspose[i]));
        }
    }
}