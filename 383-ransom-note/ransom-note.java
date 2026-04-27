class Solution {
    public boolean canConstruct(String Note, String magazine) {
        Map<Character, Integer> mag = new HashMap<>();
        for(int i = 0 ; i < magazine.length() ; i++)
        {
            mag.put(magazine.charAt(i),mag.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int i = 0 ; i < Note.length() ; i++)
        {
            char ch = Note.charAt(i);
            if(mag.containsKey(ch) && mag.get(ch) > 0)
            {
                mag.put(ch,mag.get(ch) - 1);
            }
            else
            return false;
        }
        return true;
    }
}