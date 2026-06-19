class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++)
        {
            int n = nums1[i];
            int j = 0;
            int max = 0;
            boolean found = false;
            while(j < nums2.length)
            {
                if(nums2[j] == n)
                    found = true;
                if(found)
                {
                    if(nums2[j] > n)
                    {    
                        res[i] = nums2[j];
                        break;
                    }
                } 
                j++;
            }
            if(res[i] == 0)
                res[i] = -1;
        }
        return res;
    }  
}