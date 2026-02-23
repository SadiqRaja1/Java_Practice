import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int num [] = {4,6,1,6,7,6,2,0};

        selectionSort(num);

        System.out.println(Arrays.toString(num));
    }    

    public static void selectionSort(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            int smallest = i;
            for(int j=i; j<nums.length; j++) {
                if(nums[smallest] > nums[j]){
                    smallest = j;
                }
            }

            if(nums[smallest] != nums[i]) {
                int temp = nums[smallest];
                nums[smallest] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
