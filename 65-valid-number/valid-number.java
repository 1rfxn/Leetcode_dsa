class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean res = false, dot = false, exp = false;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                res = true;
            }
            else if(c == 'e' || c == 'E')
            {
                if(exp || !res)
                return false;
                res = false;
                exp = true;
            }
            else if(c == '+' || c == '-')
            {
                if(i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                return false;
            }
            else if(c == '.')
            {
                if(dot || exp)
                return false;
                dot = true;
            }        
            else
            return false;   
        }
        return res;
    }
}