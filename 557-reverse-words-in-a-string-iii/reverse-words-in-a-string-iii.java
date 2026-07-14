class Solution {
    public String reverseWords(String s1) {
        String[] str = s1.split(" ");
        String res = "";
        for(String s : str)
        {
            String rev = "";
            for(int i = s.length() - 1 ; i >= 0 ; i--)
                rev += (s.charAt(i) +"");
            res += rev + " ";
        }
        return res.trim();
    }
}