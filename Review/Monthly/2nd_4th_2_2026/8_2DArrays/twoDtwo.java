public class twoDtwo {

    public static void main(String[] args) {
        int nums[][] ={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        print2ndRow(nums);
    }

    public static void print2ndRow(int nums[][]){
        int middle = nums.length/2;
        int sum = 0;

        for(int i=0; i<nums[middle].length; i++) {
            sum += nums[middle][i];
        }

        System.out.println(sum);
    }
}