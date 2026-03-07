class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int i = 0;
        while(i < nums.length)
        {
            res = res ^ nums[i];
            i++;
        }
        return res;
    }
}