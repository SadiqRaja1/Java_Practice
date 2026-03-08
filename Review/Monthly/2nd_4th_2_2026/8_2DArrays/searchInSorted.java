public class searchInSorted {

    public static void main (String args []) {
        int nums [] [] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        search(nums,100);
    }
    public static void search(int nums [] [], int target){
        int row = 0, col = nums.length-1;

        while(row <= nums.length-1 && col <=nums.length-1) {
            if(nums[row][col] == target) {
                System.out.println(row+" "+col);
                return;
            }else if(nums[row][col] < target) {
                row++;
            }else{
                col--;
            }
        }

        System.out.println("Number not present in array");
    }
}