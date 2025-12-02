import java.util.Arrays;

public class ArrayBasicTrappedWater {

    static boolean isAssending(int parameterHeight []) {
        for(int i= 0; i<parameterHeight.length; i++) {
            if(parameterHeight[i] > parameterHeight[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDessending(int parameterHeight []) {
        for(int i=0; i<parameterHeight.length; i++) {
            if(parameterHeight [i] < parameterHeight[i+1]) {
                return false;
            }
        }
        return true;
    }

    static void trappedWater(int parameterHeight []) {
        if(parameterHeight.length == 0 || parameterHeight.length == 1 || parameterHeight.length == 2) {
            System.out.println("Trapped water is :"+ 0);
        }

        if(isAssending(parameterHeight)) {
            System.out.println("input is assending order hence water can't be stored");
        }

        if(isDessending(parameterHeight)) {
            System.out.println("input is in desending order hence water can't be stored");
        }

        int leftMost [] = new int[parameterHeight.length];
        int RightMost [] = new int[parameterHeight.length];
        
        
        for(int i=0; i<parameterHeight.length; i++) {
            int largest = 0;
            for(int j=i; j>=0; j--) {
                largest = (largest > parameterHeight[j]) ? largest : parameterHeight[j];
            }
            leftMost[i] =largest;
        }
        
        for(int i=0; i<parameterHeight.length; i++) {
            int smallest = 0;
            for(int j=i; j<parameterHeight.length; j++) {
                smallest = (smallest > parameterHeight[j]) ? smallest : parameterHeight[j];
            }
            RightMost[i] =smallest;
        }

        System.out.println(Arrays.toString(leftMost));
        System.out.println(Arrays.toString(RightMost));

        int waterStored = 0;
        for(int i=0; i<parameterHeight.length; i++) {
            int small = (leftMost[i] < RightMost[i]) ? leftMost[i] : RightMost[i];
            waterStored = waterStored + (small - parameterHeight[i]);
        }

        System.out.println(waterStored);
        
    }
    public static void main(String[] args) {
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        
        trappedWater(height);
    }
}