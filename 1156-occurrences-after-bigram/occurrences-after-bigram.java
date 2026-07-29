class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String s[] = text.split(" ");
        List<String> res = new ArrayList<>();
        for(int  i = 0 ; i < s.length - 2 ; i++)
        {
            if(s[i].equals(first) && s[i + 1].equals(second))
                res.add(s[i + 2]);
        }
        return res.toArray(new String[0]);
    }
}