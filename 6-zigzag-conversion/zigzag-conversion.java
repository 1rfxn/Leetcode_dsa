class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
        return s;
        StringBuilder[] row = new StringBuilder[numRows];
        for(int i = 0 ; i < numRows ; i++)
        {
            row[i] = new StringBuilder();
        }
        int idx = 0;
        boolean loop = false;
        for(char c : s.toCharArray())
        {
            row[idx].append(c);
            if(idx == 0 || idx == numRows - 1)
            loop = !loop;
            idx += (loop) ? 1 : -1;
        }
        String res = "";
        for(StringBuilder a : row)
        {
            res += a;
        }
        return res;
    }
}