class Solution {
    public int findMiddleIndex(int[] nums) {
        int s1 = 0;
        for(int n : nums)
        {
            s1 += n;
        }
        int s2 = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(s1 - nums[i] == s2)
                return i;
            else
            {
                s1 -= nums[i];
                s2 += nums[i];
            }
        }
        return -1;
    }
}