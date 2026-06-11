class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1 ; i < n ; i++)
        {
            String nres = "";
            int c = 1;
            for(int j = 1 ; j < res.length() ; j++)
            {
                char c1 = res.charAt(j - 1);
                char c2 = res.charAt(j);
                if(c1 != c2)
                {
                    nres += (c+"");
                    nres += (c1+"");
                    c = 1;
                }
                else
                    c++;
            }
            nres += (c+"");
            nres += (res.charAt(res.length() - 1)+"");
            res = nres; 
        }
        return res;
    }
}