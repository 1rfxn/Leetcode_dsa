class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        int i, j;
        // while(i <= j)
        // {
        //     if(i < nums.length - 1 && nums[i] != target)
        //         i++;
        //     if(nums[j] != target)
        //         j--;
        //     if(j > 0 && nums[i] == target && nums[j] == target)
        //     {
        //         res[0] = i;
        //         res[1] = j;
        //         return res;
        //     }
        // }
        res[0] = -1;
        res[1] = -1;
        // return res;
        for(i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            {   res[0] = i;
                break;
            }
        }
        
        for(j = nums.length - 1 ; j >= 0 ; j--)
        {
            if(nums[j] == target)
            {
                res[1] = j;
                break;
            }
        }
        return res;
    }
}