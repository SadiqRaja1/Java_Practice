public class ArraysThree {

    public static void maxProfit(int parameterPrices []) {
        int profit = Integer.MIN_VALUE;
        for(int i = 0; i< parameterPrices.length; i++) {
            for(int j = i+1; j<parameterPrices.length; j++) {
                profit = profit > (parameterPrices[j] - parameterPrices[i]) ? profit : (parameterPrices[j] - parameterPrices[i]);
            }
        }
        if(profit > 0) {
            System.out.println(profit);
        }else {
            System.out.println(0);
        }
    }

    public static void optiMaxProfit (int parameterPrices []) {
        int buy = parameterPrices[0];
        int profit = 0;

        for(int i=1; i<parameterPrices.length; i++) {
            if(parameterPrices[i] > buy) {
                profit = profit > (parameterPrices[i] - parameterPrices[buy]) ? profit : (parameterPrices[i] - parameterPrices[buy]);
            }else {
                buy= parameterPrices[i];
            }
        }
        System.out.println(profit);

    }
    public static void main(String[] args) {
        int prices []= {7,1,5,3,6,4};
        int prices2 [] = {7, 6, 4, 3, 1};

        maxProfit(prices);
        maxProfit(prices2);

        optiMaxProfit(prices);
        optiMaxProfit(prices2);
        // System.out.println(maxProfit(prices));
    }
}
