class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>();
        Set<String> p = new HashSet<>();
        String mc[] = {"a.-","b-...","c-.-.","d-..","e.","f..-.","g--.","h....","i..","j.---","k-.-","l.-..","m--","n-.","o---","p.--.","q--.-","r.-.","s...","t-","u..-","v...-","w.--","x-..-","y-.--","z--.."};
        for(int i = 0 ; i < 26 ; i++)
        {
            map.put(mc[i].charAt(0),mc[i].substring(1));
        }
        for(String a : words)
        {
            String s = "";
            for(int i = 0 ; i < a.length() ; i++)
            {
                s += map.get(a.charAt(i));
            }
            p.add(s);
        }
        return p.size();
    }
}