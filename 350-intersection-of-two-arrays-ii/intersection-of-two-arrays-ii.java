class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> r = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i++)
        {
            m.put(nums1[i],m.getOrDefault(nums1[i],0) + 1);
        }
        for(int num : nums2)
        {
            if(m.containsKey(num) && m.get(num) > 0)
            {
                r.add(num);
                m.put(num, m.get(num) - 1);
            }
        }
        int[] res = new int[r.size()];
        for(int i = 0 ; i < r.size() ; i++)
        {
            res[i] = r.get(i);
        }
        return res;
    }
}