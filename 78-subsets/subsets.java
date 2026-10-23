class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        solve(0, nums, l, res);
        return res;
        }
    private void solve(int idx, int[] nums, List<Integer> l, List<List<Integer>> res)
    {
        if(idx == nums.length)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[idx]);
        solve(idx + 1, nums, l, res);
        
        l.remove(l.size() - 1);
        solve(idx + 1, nums, l, res);
    }
}