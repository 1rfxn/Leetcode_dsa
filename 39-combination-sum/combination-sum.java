class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, res, 0, new ArrayList<>());
        return res;
    }
        private void backtrack(int[] candidates, int target, List<List<Integer>> res, int idx, List<Integer> cur)
        {
            if(target == 0)
            {
                res.add(new ArrayList<>(cur));
                return;
            }
            if(target < 0)
                return;
            for(int i = idx ; i < candidates.length ; i++)
            {
                cur.add(candidates[i]);
                backtrack(candidates, target - candidates[i], res, i, cur);
                cur.remove(cur.size() - 1);
            }
        }
}