class Solution {
    public int thirdMax(int[] nums) {
        Long a = null,b = null,c = null;
        for(int i  = 0 ; i < nums.length ; i++)
        {
            if(a != null && a == nums[i] || b != null && b == nums[i] || c != null && c == nums[i])
            continue;
            if(a == null || nums[i] > a)
            {
                c = b;
                b = a; 
                a = (long)nums[i];
            }
            else if(b == null || nums[i] > b)
            {
                c = b;
                b = (long)nums[i];
            }
            else if(c == null || nums[i] > c)
            {
                c = (long)nums[i];
            }
        }
        return (c != null) ? c.intValue() : a.intValue();
    }
}
