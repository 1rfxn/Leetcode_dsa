class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {      
            res += nums[i];      
            if(res > max)
            {
                max = res;
            }
            if(res < 0)
            {
                res = 0;
            }
        }
        return max;
    }
}