class Solution {
    public String shortestCompletingWord(String lp, String[] words) {
        String str = "";
        for(int j = 0 ; j < lp.length() ; j++)
        {
            char ch = lp.charAt(j);
            if(!(ch == ' ' || ch <= '9' && ch >= '0'))
                str += ch;            
        }
        str = str.toLowerCase();
        String res = "";
        int l = Integer.MAX_VALUE;
        for(int i = 0 ; i < words.length ; i++)
        {
            String temp = words[i];
            
            for(int j = 0 ; j < str.length() ; j++)
            {
                char ch = str.charAt(j);
                if(temp.contains(ch+""))
                    temp = temp.replaceFirst(ch+"","");
                else
                    break;
                if(j == str.length() - 1)
                {
                    if(l > words[i].length())
                    {
                        l = words[i].length();
                        res = words[i];
                    }
                }
            }
        }
            return res;
    }
}