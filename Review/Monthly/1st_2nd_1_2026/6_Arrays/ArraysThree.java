public class ArraysThree {

    public static void maxProfit(int prices []) {
        int profit = 0;
        for(int i=0; i<prices.length-1; i++) {
            for(int j = i+1; j<prices.length; j++) {
                if(prices[i] < prices[j]) {
                    profit = (prices[j] - prices[i]) > profit ? (prices[j] - prices[i]) : profit;
                }
            }
        }
        System.out.println(profit);
    }

    public static void maxProfitOpti(int prices []) {
        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++) {
            if(prices [i] > buy) {
                profit = Math.max(prices[i]-buy, profit);
            }else{
                buy = prices[i];
            }
        }

        System.out.println(profit);
    }
    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 6, 4};
        int prices2 [] = {7,6,5,4,3,1};

        maxProfit(prices);
        maxProfitOpti(prices);

        maxProfit(prices2);
        maxProfitOpti(prices2);
        
    }
}