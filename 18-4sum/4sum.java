class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < n - 3 ; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
            continue;
            for(int j = i + 1 ; j < n - 2 ; j++)
            {
                if(j > i + 1 && nums[j] == nums[j - 1])
                continue;
                int left = j + 1;
                int ryt = n - 1;
                while(left < ryt)
                {
                    long tot = (long) nums[i] + nums[j] + nums[left] + nums[ryt];
                    if(tot == target)
                    {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[ryt]));
                        while(left < ryt && nums[left] == nums[left + 1])
                        {
                            left++;
                        }
                        while(left < ryt && nums[ryt] == nums[ryt - 1])
                        {
                            ryt--;
                        }
                        left++;
                        ryt--;
                    }
                    else if(tot > target)
                    ryt--;
                    else
                    left++;
                }
            }
        }
        return res;
        
        }
}