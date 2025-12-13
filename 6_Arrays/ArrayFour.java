import java.util.Arrays;

public class ArrayFour {

    // public static int [] rightMostFunc(int parameterArr1 []) {
    //     int rightMostArray [] = new int[parameterArr1.length];
    //     for (int i=0; i<parameterArr1.length; i++) {
    //         int rightbiggest = 0;
    //         for(int j=i; j<parameterArr1.length; j++) {
    //             rightbiggest = Math.max(parameterArr1[j], rightbiggest);
    //         }
    //         rightMostArray[i] =rightbiggest;
    //     }

    //     
    //     return rightMostArray;
    // }

    public static int [] rightMostFuncOpti (int parameterArr1 []) {
        int rightMostArray [] = new int [parameterArr1.length];
        rightMostArray [parameterArr1.length-1] = parameterArr1[parameterArr1.length-1];

        for(int i=parameterArr1.length-2; i>=0; i--) {
            rightMostArray[i] = Math.max(rightMostArray[i+1], parameterArr1[i]);
        }
        
        return rightMostArray;
    }

    public static int [] leftMostFuncOpti(int parameterArr1 []) {
        int leftMostArray [] = new int[parameterArr1.length];
        leftMostArray[0] = parameterArr1[0];

        for(int i=1; i<parameterArr1.length; i++) {
            leftMostArray[i] = Math.max(leftMostArray[i-1], parameterArr1[i]);
        }
        return leftMostArray;
    }

    // public static int [] leftMostFunc(int parameterArr1 []) {
    //     int leftMostArray [] = new int[parameterArr1.length];
    //     for (int i=parameterArr1.length-1; i>=0; i--) {
    //         int leftbiggest = 0;
    //         for(int j=i; j>=0; j--) {
    //             leftbiggest = Math.max(parameterArr1[j], leftbiggest);
    //         }
    //         leftMostArray[i] =leftbiggest;
    //     }
    //     return leftMostArray;
    // }

    public static int trapedWater(int parameterArr1 []) {
        int totalTrappedWater = 0;

        if (parameterArr1.length == 0 || parameterArr1.length == 1 || parameterArr1.length == 2) {
            return 0;
        }
        int rightMost [] = Arrays.copyOf(rightMostFuncOpti(parameterArr1), parameterArr1.length);
        int leftMost [] = Arrays.copyOf(leftMostFuncOpti(parameterArr1), parameterArr1.length);

        
        for(int i=0; i<parameterArr1.length; i++) {
            if(rightMost[i] < leftMost[i]) {
                totalTrappedWater = totalTrappedWater + (rightMost[i] - parameterArr1[i]);
            }else {
                totalTrappedWater = totalTrappedWater + (leftMost[i] - parameterArr1[i]);
            }
        }

        return totalTrappedWater;
    }
    public static void main(String[] args) {
        int arr1 [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int arr2 [] = {4, 2, 0, 3, 2, 5};

        System.out.println((trapedWater(arr1)));
        System.out.println(trapedWater(arr2));

      
    }
}
