import java.util.Arrays;

public class ArraysBasic {

    // public static void update (int parameterMarks []) {
    //     for (int i=0; i<parameterMarks.length; i++) {
    //         parameterMarks[i] +=1;
    //     }
    // }
    public static void main(String[] args) {
        /* 1 
        int num [] = {1,2,3,4,5};
        
        String fruits [] = {"apple", "banana", "mango"};

        char character [] = {'a', 'b', 'c','d', 'e'};

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(fruits));
        System.out.println(Arrays.toString(character));

        System.out.println(num.length);
        fruits[0] = "jackfruit";

        System.out.println(Arrays.toString(fruits));

        int newNum []= new int[20];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        */

        /* 
        //passing array as argument
        // when we pass array as argument it's address shared so what changes done updated in original once also
        int marks[] = {97, 88, 98};
        update(marks);

        for(int i =0; i<marks.length; i++) {
            System.out.println(marks[i] + " ");
        }

        */

        /*
        // Array search 
        
        int arr [] = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(target + " is at array's "+ i + "th index");
            }
        }

        */

        /* 

            //Largest Number

            int numLine [] = {1, 2, 6, 3, 5};

             
            //brute force
            int largest = 0; //or Integer.MIN_VALUE
            for(int i=0; i<numLine.length; i++) {
                largest = (largest < numLine[i]) ? numLine[i] : largest;
            }
            System.out.println(largest);

            

            //sort and give the last one
            Arrays.sort(numLine);
            System.out.println("largest is "+ numLine[numLine.length-1]);

        */

            // Pair in Array
            int numArr [] = {2, 4, 6, 8, 10};

            for(int i = 0; i<numArr.length; i++) {
                for(int j = 1; j<numArr.length-i; j++) {
                    System.out.print("(" + numArr[i]+ ", "+ numArr[j]+ ")" + " ");
                }
            }
    }
    
}
