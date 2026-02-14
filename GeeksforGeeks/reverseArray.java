import java.util.Arrays;

public class reverseArray {
   public static void main(String args []) {
        int arr[] = {1,4,2,6,5};
        
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
   } 

   public static void reverseArray(int arr []) {
      for(int i=0, j=arr.length-1; i < j; i++, j--) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      }
   }
}
