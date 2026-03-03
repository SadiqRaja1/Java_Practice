import java.util.Arrays;

public class SortingOne {
    public static void main (String args []) {
        int nums [] = {5,4,5,5,4,3,1,2,0};

        // RverseBubbleSort(nums);
        // ReverseCountingSort(nums);
        // RverseSelection(nums);
        ReverserInsertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
    public static void ReverserInsertionSort(int nums []) {
        for(int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int j=i-1;
            while(j >=0 && nums[j] < curr) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]=curr;
        }
    }

    public static void RverseSelection(int nums []) {
        for(int i=0; i<nums.length; i++) {
            int bigest = i;
            for(int j=i+1; j<nums.length;j++){
                if(nums[j] > nums[bigest]) {
                    bigest = j;
                }
            }
            if(i != bigest){
                int temp = nums[i];
                nums[i]= nums[bigest];
                nums[bigest] = temp;
            }

        }
    }

    public static void ReverseCountingSort(int nums []) {
        int maxNum = 0;
        for(int i=0; i<nums.length; i++) {
            maxNum = Math.max(nums[i], maxNum);
        }

        int helperArray [] = new int[maxNum+1];

        for(int i=0; i<nums.length; i++) {
            helperArray[nums[i]]++;
        }
        
        int index = 0;
        for(int i=helperArray.length-1;i>=0;i--) {
            while (helperArray[i] != 0) {
                nums[index] = i;
                index++;
                helperArray[i]--;
            }
        }
    }

    public static void RverseBubbleSort(int nums []) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length-1; j++) {
                if(nums [j] < nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
