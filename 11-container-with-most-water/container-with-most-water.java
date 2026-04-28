class Solution {
    public int maxArea(int[] hyt) {
        int water = 0;
        int left = 0, ryt = hyt.length - 1;
        while(left < ryt)
        {
            int width = ryt - left;
            int h = (hyt[left] < hyt[ryt]) ? hyt[left] : hyt[ryt];
            int area = width * h;
            water = (water < area) ? area : water;
            if(hyt[ryt] < hyt[left])
                ryt--;
            else
                left++;
        }
        return water;
    }
}