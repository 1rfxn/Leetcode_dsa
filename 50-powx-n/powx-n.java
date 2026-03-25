class Solution {
    public double myPow(double x, int n) {
        long $ = n;
        if($ < 0)
        {
            x = 1 / x;
            $ = -$;
        }
        double res = 1;
        while($ > 0)
        {
            if($ % 2 == 1)
            {
                res *= x;
            }
            x = x * x;
            $ /= 2;
        }
        return res;
    }
}