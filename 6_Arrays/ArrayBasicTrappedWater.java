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
        
        for(int i=0; i<=parameterHeight.length; i++) {
            for(int j=i; j>=0; j--) {
                leftMost[i] = (parameterHeight[j] > parameterHeight[j-1] ? parameterHeight[j] :parameterHeight[j-1]);
            }
        }
        System.out.println(Arrays.toString(leftMost));
        
    }
    public static void main(String[] args) {
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        
        trappedWater(height);
    }
}