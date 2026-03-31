class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
        return true;
        int k = 0;
        for(int i = 0 ; i < t.length() ; i++)
        {
            if((k == s.length() - 1) && (s.charAt(k) == t.charAt(i)))
                return true;
            if(s.charAt(k) == t.charAt(i)) 
                k++;
        }
        return false;
    }
}