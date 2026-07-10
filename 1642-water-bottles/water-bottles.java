class Solution {
    public int numWaterBottles(int bot, int ex) {
        int res = bot;
        int rem = bot;
        while(rem >= ex)
        {
            int nbot = rem / ex;
            res += nbot;
            rem = nbot + (rem % ex);
        }
        return res;
    }
}