class Solution {
    public boolean judgeCircle(String moves) {
        List<Character> m = new ArrayList<>();
        for(int i = 0 ; i < moves.length() ; i++)
        {
            char c = moves.charAt(i);
            if(!(m.isEmpty()) && m.contains(c))
            {
                m.remove((Character)c);
                continue;
            }
            if(c == 'U')
                m.add('D');
            else if(c == 'D')
                m.add('U');
            else if(c == 'R')
                m.add('L');
            else if(c == 'L')
                m.add('R');
        }
        return m.isEmpty();
    }
}