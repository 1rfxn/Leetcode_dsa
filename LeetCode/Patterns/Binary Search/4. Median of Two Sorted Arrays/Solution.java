class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int idx = 0;
        while(nums1.length > i && nums2.length > j)
        {
            if(nums1[i] > nums2[j])
                num[idx++] = nums2[j++];
            else
                num[idx++] = nums1[i++];
        }
        while(i < nums1.length)
            num[idx++] = nums1[i++];
        while(j < nums2.length)
            num[idx++] = nums2[j++];
        if(num.length % 2 == 0)
            return (num[num.length / 2] + num[(num.length / 2) - 1]) / 2.;
        else
            return num[num.length / 2];
    }
}