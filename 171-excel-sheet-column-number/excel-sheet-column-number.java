class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int i = 0;
        while(i < columnTitle.length())
        {
            char c = columnTitle.charAt(i);
            int val = (c - 'A') + 1;
            res = res * 26 + val;
            i++;
        }
        return res;
    }
}