public class bestTimeToBuyAndSellStock {
    public static void main (String args [] ) {

        int stocks [] = {7,6,4,3,1};

        System.out.println("Max Profit is "+ maxProfit(stocks));        
    }

    public static int maxProfit(int prices []) {
        int curr = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            if (prices[i] < curr) {
                curr = prices[i];
            }else {
                profit = Math.max (profit, prices[i] - curr);
            }
        }

        return profit;
    }
}