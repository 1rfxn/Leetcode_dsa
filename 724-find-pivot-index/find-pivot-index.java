class Solution {
    public int pivotIndex(int[] nums) {
        int i = 0;
        int lsum = 0,rsum = 0;
        for(int n : nums)
            rsum += n;
        while(i < nums.length)
        {
            rsum -= nums[i];
            if(lsum == rsum)
                return i;
            lsum += nums[i];
            i++;
        }
        return -1;
    }
}