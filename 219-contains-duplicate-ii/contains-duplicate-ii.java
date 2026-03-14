class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> a = new HashSet<>();
        int i = 0;
        while(i < nums.length)
        {
            if(a.contains(nums[i]))
                return true;
            else
                a.add(nums[i]); 

            if(a.size() > k)
                a.remove(nums[i - k]);
            
            i++;
        }

        return false;
    }
}