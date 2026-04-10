class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int prft = 0;
        for(int price : prices)
        {
            if(min > price)
            min = price;
            else
            prft = Math.max(price - min,prft);
        }
        return prft;
    }
}
