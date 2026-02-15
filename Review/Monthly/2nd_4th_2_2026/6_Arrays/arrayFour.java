import java.util.Arrays;

public class arrayFour {

    public static void main(String[] args) {
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height1 [] = {4,2,0,3,2,5};

        System.out.println(trappedWater(height));
        System.out.println(trappedWater(height1));
    }

    public static int trappedWater(int height []) {
        int leftMost[] = leftMost(height);
        int rightMost [] = rightMost(height);

        int water = 0;
        for(int i=0; i<height.length; i++) {
            int min = Math.min(leftMost[i], rightMost[i]);
            water = water + min -height[i];
        }
        return water;
    }

    public static int [] leftMost(int height []) {
        int leftMostArray []= new int[height.length];
        leftMostArray[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMostArray[i] = Math.max(leftMostArray[i-1], height[i]);
        }
        return leftMostArray;
    }

    public static int [] rightMost(int height []) {
        int rightMostArray[] = new int[height.length];
        rightMostArray[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--) {
            rightMostArray[i] = Math.max(rightMostArray[i+1], height[i]);
        }
        return rightMostArray;
    }
}