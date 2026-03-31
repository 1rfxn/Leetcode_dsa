class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        String str = s + t;
        for(int i = 0 ; i < str.length() ; i++)
        {
        res ^= str.charAt(i);
        }
        return (char)res;
    }
}