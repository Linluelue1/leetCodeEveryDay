public class solution {

    public int maxProfit(int[] prices){
        int maxNum=prices[0],minNum=prices[0],result=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<minNum){
                minNum=prices[i];
                maxNum=prices[i];
            }else if (prices[i]>maxNum ){
                maxNum=prices[i];
            }
            if (maxNum-minNum>result){
                result=maxNum-minNum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        solution s1 = new solution();
        int result = s1.maxProfit(prices);
        System.out.println(result);
    }
}
