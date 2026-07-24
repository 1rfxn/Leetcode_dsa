class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] arr, int target, int idx, List<Integer> cur, List<List<Integer>> res)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = idx ; i < arr.length; i++)
        {
            if(i > idx && arr[i] == arr[i - 1])
                continue;
            if(target < 0)
                break;
            cur.add(arr[i]);
            backtrack(arr, target - arr[i], i + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}