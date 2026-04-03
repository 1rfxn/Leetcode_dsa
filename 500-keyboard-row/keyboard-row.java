class Solution {
    public String[] findWords(String[] words) {
        String[] key = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> res = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++)
        {
            String word = words[i].toLowerCase();
            for(int k = 0 ; k < 3 ; k++)
            {
                if(key[k].contains(word.charAt(0)+""))
                {
                    int j;
                    for(j = 0 ; j < word.length() ; j++)
                    {
                        if(!key[k].contains(word.charAt(j)+""))
                        break;
                    }
                        if(j == word.length())
                        res.add(words[i]);
                }
            }   
        }
    return res.toArray(new String[0]);    
    }
}