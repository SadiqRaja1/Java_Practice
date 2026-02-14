import java.util.Arrays;
import java.util.HashSet;

public class removeDupfromArray26 {
    public static void main(String[] args) {
        // int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int nums [] = {-3,-1,0,0,0,3,3};

        // int nums [] = {1,1,2};

        int nums[] = {-3,-1,-1};

        int k = removeDuptwoPointer(nums);

        // removeDupbruteforce(arr);

        System.out.println(k);

        System.out.println(Arrays.toString(nums));


    }

    public static int removeDuptwoPointer(int [] nums){
        int j = 1;
        for(int i =1; i<nums.length; i++){
            if(nums[i] != nums[i-1]) {
                nums [j] = nums[i];
                j++; 
            }
        }
        return j;

    }



    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();

        for (int num : arr) {
            hash.add(num);
        }

        System.out.println(hash);

        int i=0;
        for(int num : hash){
            arr[i] = num;
            i++;
        }

        for(;i<arr.length;i++){
            arr[i]=0;
        }
        
        return hash.size();
    }

    public static int removeDupbruteforce(int [] nums){
        int newArr []= new int[nums.length];

        newArr[0] = nums[0];
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] !=nums[i-1]) {
                newArr[j] =nums[i];
                j++;
            }
        }
        int count = 1;

        for(int i=0; i<newArr.length-1; i++) {
            if(newArr[i] < newArr[i+1]){
                count++;
            }else{
                break;
            }
        }

        if(nums[nums.length-1] < 0){
            for(int i=0; i<nums.length; i++) {
            nums[i] = newArr[i];
        }
        }
        

        return count ;
    }
}
