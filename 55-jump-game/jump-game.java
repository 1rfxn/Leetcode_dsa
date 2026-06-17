class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(max < i)
                return false;
            if(max < (nums[i] + i))
                max = nums[i] + i;
            if(max >= (nums.length - 1))
                return true;
        }
        return true;
    }
}