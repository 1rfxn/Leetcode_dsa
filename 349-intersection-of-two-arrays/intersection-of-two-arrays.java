class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        for(int n : nums1)
        {
            a.add(n);
        }
        Set<Integer> r = new HashSet<>();
        for(int n : nums2)
        {
            if(a.contains(n))
            r.add(n);
        } 
        int res[] = new int[r.size()];
        int i = 0;
        for(int n : r)
        {
            res[i] = n;
            i++;
        }
        return res;
    }
}