class Solution {
    public int majorityElement(int[] nums) {
        int c = 1;
        int n = nums[0];
        int i = 1;
        while(i < nums.length)
        {
            if(nums[i] == n)
            c++;
            else
            c--;

            if(c == 0) {
            n = nums[i];
            c++; }

            i++;
        }
        return n;
    }
}