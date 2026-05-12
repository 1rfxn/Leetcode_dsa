class Solution {
    public String toGoatLatin(String sentence) {
        String res = "";
        String vwl = "AEIOUaeiou";
        String[] str = sentence.split(" ");
        int a = 1,b = a;
        for(String s : str)
        {
            char ch = s.charAt(0);
            if(vwl.contains(ch+""))
                s += "ma";
            else
                s = s.substring(1) + s.substring(0,1) + "ma";
            String $a = "";
            while(a > 0)
            {
            $a += "a";
            a--;
            }
            s += $a;
            a = b + 1;
            b = a;
            res += s + " ";
        }
        return res.trim();
    }
}