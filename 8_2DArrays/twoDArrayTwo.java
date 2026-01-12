public class twoDArrayTwo {

    public static int print2ndRow(int num [][]) {
        int row = num[num.length/2].length;
        int sum = 0;
        for(int i=0; i<row; i++) {
            sum = sum+ (num[num.length/2][i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] [] nums = {
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };

        System.out.println(print2ndRow(nums));
    }
}