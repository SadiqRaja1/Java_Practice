public class arrayThree {

    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};

        System.out.println(maxProfitOpti(prices));
    }

    public static int maxProfit(int prices []) {
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }

    public static int maxProfitOpti(int prices []) {
        int buy = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] > buy) {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            }else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}