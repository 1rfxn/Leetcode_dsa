class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for(int i = 0 ; i < s.length() ; i += 2 * k)
        {
            int left = i;
            int ryt = Math.min(i + k - 1, a.length - 1);
            while(left < ryt)
                {
                    char temp = a[left];
                    a[left] = a[ryt];
                    a[ryt] = temp;
                    left++;
                    ryt--;
                }
        }
            return new String(a);
    }
}

