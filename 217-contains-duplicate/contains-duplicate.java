class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        int i = 0;
        while(i < nums.length)
        {
            if(n.contains(nums[i]))
            return true;
            else
            n.add(nums[i]);
            
            i++;
        }
        return false;
    }
}