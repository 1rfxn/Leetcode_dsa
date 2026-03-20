class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> s = new HashSet<>();
        int c = 0;
        for(int i = 0 ; i < word.length() ; i++)
        {
            s.add(word.charAt(i));
        }
        for(char i = 'a' ; i <= 'z' ; i++)
        {
            if(s.contains(i) && s.contains(Character.toUpperCase(i)))
            c++;
        }
        return c;
    } 
} 