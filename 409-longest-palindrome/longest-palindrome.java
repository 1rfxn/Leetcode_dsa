class Solution {
    public int longestPalindrome(String s) {
        int[] a = new int[60];
        for(char c : s.toCharArray())
        {
            int idx = c - 'A';
            a[idx]++;
        }
        int res = 0;
        for(int n : a)
        {
            res += (n / 2) * 2;
            if(res % 2 == 0 && n % 2 == 1)
            res++;
        }
        return res;
    }
}