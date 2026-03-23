class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        return false;
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s2t.containsKey(s.charAt(i)))
            {
                if(!(s2t.get(s.charAt(i)).equals(t.charAt(i))))
                {
                    return false;
                }
            }
            else
                s2t.put(s.charAt(i), t.charAt(i));

            if(t2s.containsKey(t.charAt(i)))
            {
                if(!(t2s.get(t.charAt(i)).equals(s.charAt(i))))
                {
                    return false;
                }
            }
            else
                t2s.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}