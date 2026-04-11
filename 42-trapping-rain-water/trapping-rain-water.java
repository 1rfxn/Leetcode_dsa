class Solution {
    public int trap(int[] height) {
        int left = 0, ryt = height.length - 1;
        int lmax = 0, rmax = 0;
        int water = 0;
        while(left < ryt)
        {
            if(height[left] < height[ryt])
            {
                if(height[left] >= lmax)
                lmax = height[left];
                else
                water += (lmax - height[left]);
                left++;
            }
            else
            {
                if(height[ryt] >= rmax)
                rmax = height[ryt];
                else
                water += rmax - height[ryt];
                ryt--;
            }
        }
        return water;
    }
}