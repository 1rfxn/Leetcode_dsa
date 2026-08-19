class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int i = nums[0],j = nums[nums.length - 1];
        int idx = 0;
        while(i <= j)
        {
            if(nums[idx] != i)
                res.add(i);
            else
                idx++;
            i++;
        }
        return res;
    }
}