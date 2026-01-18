import java.util.Arrays;

public class rowMaxOne2643 {
    public static void main(String [] args) {
        int nums [][] = {
            {0,0},
            {1,1},
            {0,0}
        };

        // findRowMax1(nums);
        System.out.println(Arrays.toString(findRowMax1(nums)));
    }

    public static int [] findRowMax1(int nums[][]) {
        int mainCount [] = new int[2];
        for(int i=0; i< nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums[0].length; j++) {
                if(nums[i][j] == 1) {
                    count++;
                }
            }
            if(mainCount[1] < count) {
                mainCount[0] = i;
                mainCount[1] = count;
            }
        }
        return mainCount;
    }
}