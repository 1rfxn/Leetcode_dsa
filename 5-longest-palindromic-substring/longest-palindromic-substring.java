class Solution {
    private boolean isPal(String str)
    {
        int i = 0,j = str.length() - 1;
        boolean res = true;
        while(i < j)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return res;
    }
    public String longestPalindrome(String s) {
        if(s.length() == 1)
        return s;
        String str = "";
        for(int i = 0 ; i < s.length() - 1; i++)
        {
            for(int j = i ; j < s.length() ; j++)
            {
                String ans = s.substring(i, j + 1);
                if(isPal(ans) && ans.length() > str.length())
                str = ans;
            }
        }
        return str;
    }
}