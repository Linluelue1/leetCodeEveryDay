public class solution {

    public int maxProfit(int[] prices) {
        int min=prices[0],max = prices[0],profits=0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
                max=prices[i];
            } else if (prices[i]>max) {
                profits += prices[i] - min;
                min = prices[i];
                max = prices[i];
            }
        }
        return profits;
    }

    public static void main(String[] args) {
        solution s1 = new solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s1.maxProfit(prices));
    }
}
