public class ArraysThree {

    public static int profitCheck(int parameterPrices []) {
        int profit = 0;

        for(int i=0; i<parameterPrices.length; i++) {
            for(int j=i+1; j<parameterPrices.length; j++) {
                int temp = parameterPrices[j] - parameterPrices[i];
                
                profit = (temp > profit)? temp : profit;
                
            }
        }
        return profit;
    }

    public static int optiProfitCheck(int parameterPrices []) {
        int buy = parameterPrices[0];
        int profit = 0;

        for(int i=1; i<parameterPrices.length; i++) {
            if(parameterPrices[i] > buy) {
                profit = Math.max(parameterPrices[i] - buy, profit);
            }else {
                buy = parameterPrices [i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices1 [] = {7, 1, 5, 3, 6, 4};
        int prices2 [] = {7, 6, 4, 3, 1}; 

        System.out.println(optiProfitCheck(prices1));
        System.out.println(optiProfitCheck(prices2));
    }
}
