import java.util.Arrays;

public class productOfArrayExpectSelf238 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        // int nums [] = {1,1,1,1};
        // int nums [] = {-1,-2,-3,-4};


        printProductWithOutDivide(nums);
        // System.out.println(Arrays.toString(printProductWithOutDivide(nums)));
    }

    public static void printProductWithOutDivide(int nums[]) {
        int n = nums.length;
        int prev = 1;
        int post = 1;
        int newNums [] = new int[n];

        Arrays.fill(newNums, 1);

        for(int i=0; i<n; i++) {
            newNums[i] *=prev;
            prev*=nums[i];
        }

        for(int i=n-1; i>=0; i--) {
            newNums[i] *= post;
            post*=nums[i];
        }
        System.out.println(Arrays.toString(newNums));
    }

    public static int[] printProductOpti (int nums[]) {
        int product = 1;
        int n= nums.length;
        int countZero = 0;
        int ZeroIndex = 0;
        int newNum [] = new int[n];

        for(int i=0; i<n; i++) {
            if(nums[i] == 0){
                countZero++;
                ZeroIndex = i;
            }else{
                product *= nums[i];
            }
        }

        if(countZero > 1){
            return newNum;
        }else if(countZero == 1){
            newNum[ZeroIndex] = product;
            return newNum;
        }else{
            for(int i=0; i<n; i++) {
                newNum[i] = product/nums[i];
            }
        }
        return newNum;
    }

    public static int [] printProduct(int nums []) {
        int n=nums.length;
        int newNums [] = new int[n];


        for(int i=0; i<n; i++) {
            int product = 1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    product *=nums[j];
                }
            }
            newNums[i] = product;
        }

        return newNums;
    }
}