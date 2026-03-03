class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while(i > 0)
        {
            if(i*i == num) {
            return true; }
            if(i*i > num) {
            break; }
              
        i++;
        }
        return false;
    }
}