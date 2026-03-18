class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++)
        {
            int left = i + 1;
            int ryt = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1])
            continue;
            while(left < ryt)
            {
            int sum = nums[i] + nums[left] + nums[ryt];
            if(sum == 0)
            {
                res.add(Arrays.asList(nums[i],nums[left],nums[ryt]));
                while((left < ryt) && nums[left] == nums[left + 1])
                {
                    left++;
                }
                while((left < ryt) && nums[ryt] == nums[ryt - 1])
                {
                    ryt--;
                }
                left++;
                ryt--;
            }
            else if(sum > 0)
            ryt--;
            else
            left++;
            }
        }
        return res;
    }
}