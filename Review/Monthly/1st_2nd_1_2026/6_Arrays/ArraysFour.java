import java.util.Arrays;

public class ArraysFour {

    public static int [] leftMax(int height []) {
        int leftMaxArr [] = new int[height.length];

        leftMaxArr [0] = height[0];

        for(int i=1; i<height.length; i++) {
            leftMaxArr[i] = Math.max(leftMaxArr[i-1], height[i]);
        }

        return leftMaxArr;
    }

    public static int [] rightMax(int height []) {
        int rightMaxArr [] = new int[height.length];

        rightMaxArr[height.length-1] = height[height.length-1];

        for(int i = height.length-2; i>= 0; i--) {
            rightMaxArr[i] = Math.max(rightMaxArr[i+1], height[i]);
        }

        return rightMaxArr;
    }

    public static int waterStored(int height [] ) {
        if(height.length == 0 || height.length == 1 || height.length == 2) return 0;

        int storedWater = 0;
        int leftMax [] = leftMax(height);
        int rightMax [] = rightMax(height);

        for(int i=0; i<height.length; i++) {
            storedWater += ((Math.min(leftMax[i], rightMax[i])) - height[i]);
        }

        return storedWater;
    }

    public static void main(String[] args) {
        int height [] = {0 ,1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(waterStored(height));

        int height2 [] = {4, 2, 0, 3, 2, 5};
        System.out.println(waterStored(height2));
    }
}