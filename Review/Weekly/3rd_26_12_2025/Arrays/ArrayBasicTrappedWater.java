
public class ArrayBasicTrappedWater {

    public static int [] rightMost(int parameterArr []) {
        int rightMost [] = new int [parameterArr.length];
        rightMost[parameterArr.length-1] = parameterArr[parameterArr.length-1];

        for(int i=parameterArr.length-2; i>=0; i--) {
            rightMost[i] = rightMost[i+1] > parameterArr[i] ? rightMost[i+1] : parameterArr[i];
        }

        return rightMost;
    }
    public static int [] leftMost(int parameterArr[]) {
        int leftMost [] = new int[parameterArr.length];
        leftMost[0] =parameterArr[0];
        for(int i=1; i<parameterArr.length; i++){
            leftMost[i] = leftMost[i-1] > parameterArr[i]? leftMost[i-1] : parameterArr[i];
        }

        return leftMost;
    }

    // public static boolean checkAssending(int parameterArr []) {
    //     for(int i=1; i<parameterArr.length; i++){
    //         if(parameterArr[i-1] > parameterArr[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static boolean checkDessending(int parameterArr[]) {
    //     for(int i=parameterArr.length -2; i>=0; i--) {
    //         if(parameterArr[i+1] < parameterArr[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static int trappedWater(int parameterArr []) {
        if(parameterArr.length == 1 || parameterArr.length ==2) {
            return 0;
        }

        // if(checkAssending(parameterArr) || checkDessending(parameterArr) ) {
        //     System.out.println("hi");
        //     return 0;
        // }
        int leftMost [] = leftMost(parameterArr);
        int rightMost [] = rightMost(parameterArr);

        int waterStored = 0;
        for(int i=0; i<parameterArr.length; i++) {
            if(leftMost[i] < rightMost[i]) {
                waterStored = waterStored + (leftMost[i] - parameterArr[i]);
            }else {
                waterStored = waterStored + (rightMost[i] - parameterArr[i]);
            }
        }
        return waterStored;
    }
    public static void main(String[] args) {
        int arr [] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
    }
}