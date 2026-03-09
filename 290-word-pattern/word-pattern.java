class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        char[] let = pattern.toCharArray();
        if(pattern.length() != word.length)
        return false;
        HashMap<Character, String> cs = new HashMap<>();
        HashMap<String, Character> sc = new HashMap<>(); 
        for(int i = 0 ; i < let.length ; i++)
        {
            if(cs.containsKey(let[i]))
            {
                if(cs.get(let[i]).equals(word[i]))
                    continue;
                else
                    return false;
            }
            else
            cs.put(let[i] , word[i]);

            if(sc.containsKey(word[i]))
            {
                if(sc.get(word[i]).equals(let[i]))
                continue;
                else
                return false;
            }
            else
            sc.put(word[i], let[i]);
        }
        return true;
    }
}