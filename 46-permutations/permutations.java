class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean[] f = new boolean[nums.length];
        pr(nums, res, l, f);
        return res;
    }
    private void pr(int[] nums,List<List<Integer>> res, List<Integer> l, boolean[] f)
    {
        if(l.size() == nums.length)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(f[i])
                continue;

            l.add(nums[i]);
            f[i] = true;
            
            pr(nums,res,l,f);

            l.remove(l.size() - 1);
            f[i] = false;
        }
    }

}