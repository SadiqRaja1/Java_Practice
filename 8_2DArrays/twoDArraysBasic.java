import java.util.Arrays;
import java.util.Scanner;

public class twoDArraysBasic {
    
    public static void main(String[] args) {

        /*
        // Creation of array 
        Scanner sc = new Scanner(System.in);
        int arr [] [] = new int [3][3];

        for(int i=0; i<arr.length; i++) {
            for(int j= 0; j<arr[i].length; j++) {
                System.out.print("Enter number of intex [" + i + "],["+ j + "] -");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

        */

        /* 
        //Search in 2d Array

        int arr [] [] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int target = 7;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == target) {
                    System.out.println("Target located at index " + i+ " " + j);
                }
            }
        }
        */

        int arr [] [] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,14}
        };

        System.out.println(Arrays.deepToString(arr));
    }
}
