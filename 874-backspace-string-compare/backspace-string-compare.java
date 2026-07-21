class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s1.isEmpty() && s.charAt(i) == '#')
                continue;
            else if(s.charAt(i) == '#')
                s1.pop();
            else
                s1.push(s.charAt(i));
        }
        Stack<Character> t1 = new Stack<>();
        for(int i = 0 ; i < t.length() ; i++)
        {
            if(t1.isEmpty() && t.charAt(i) == '#')
                continue;
            else if(t.charAt(i) == '#')
                t1.pop();
            else
                t1.push(t.charAt(i));
        }
        return s1.equals(t1);
    }
}