class Solution {
    public int missingInteger(int[] nums) {
        int s = 0,i = 0;
        for (i = 0; i < nums.length; i++) {
            s += nums[i];
            if (i < nums.length - 1 && nums[i] + 1 != nums[i + 1]) 
                break;
        }
        Set<Integer> l = new HashSet<>();
        for(i = 0 ; i < nums.length ; i++)
        {
            l.add(nums[i]);
        }
        while(l.contains(s))
        {
            s++;
        }
        return s;
    }
}