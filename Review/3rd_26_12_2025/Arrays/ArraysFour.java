public class ArraysFour {
    public static int [] maxLeft(int parameterHeight[]) {
        int maxLeft[] = new int[parameterHeight.length];

        maxLeft[0] = parameterHeight[0];

        for (int i = 1; i < parameterHeight.length; i++) {
            maxLeft[i] = parameterHeight[i] > maxLeft[i - 1] ? parameterHeight[i] : maxLeft[i - 1];
        }
        return maxLeft;
    }

    public static int [] maxRight(int parameterHeight[]) {
        int maxRight[] = new int[parameterHeight.length];

        maxRight[parameterHeight.length-1] = parameterHeight[parameterHeight.length-1];

        for (int i = parameterHeight.length-2; i >=0; i--) {
            maxRight[i] = parameterHeight[i] > maxRight[i + 1] ? parameterHeight[i] : maxRight[i + 1];
        }
        return maxRight;
    }

    public static void trappedWater(int parameterHeight []) {
        int maxLeft [] = maxLeft(parameterHeight);
        int maxRight [] = maxRight(parameterHeight);

        int totWater = 0;
        for(int i = 0; i<parameterHeight.length; i++ ) {
            totWater = totWater + (maxLeft[i] < maxRight[i] ? maxLeft[i] - parameterHeight[i] : maxRight[i] - parameterHeight[i]);
        }        
        System.out.println(totWater);
    }
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int height2 [] = {4 ,2 ,0 ,3, 2, 5};

        trappedWater(height);
        trappedWater(height2);
    }
}
