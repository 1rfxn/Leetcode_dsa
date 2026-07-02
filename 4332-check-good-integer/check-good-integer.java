class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum = 0;
        int ssum = 0;
        while(n > 0)
        {
            dsum += n%10;
            ssum += (n%10) * (n%10);
            n /= 10;
        }
        if((ssum - dsum) >= 50)
            return true;
        else 
            return false;
    }
}