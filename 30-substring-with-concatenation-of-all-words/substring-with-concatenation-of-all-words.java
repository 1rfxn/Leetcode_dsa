class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int letcount = words[0].length();
        int wordcount = words.length;
        int wdlength = letcount * wordcount;
        List<Integer> res = new ArrayList<>();
        HashMap<String, Integer> expop = new HashMap<>();

        for(String word : words)
        {
            expop.put(word,expop.getOrDefault(word,0) + 1);
        }

        for(int i =  0 ; i < letcount ; i++)
        {
            int left = i,c = 0;
            HashMap<String, Integer> curop = new HashMap<>();
            for(int j = i ; j <= s.length() - letcount ; j += letcount)
            {
                String str = s.substring(j, j + letcount);

                if(expop.containsKey(str))
                {
                    curop.put(str,curop.getOrDefault(str,0) + 1);
                    c++;

                    while(expop.get(str) < curop.get(str))
                    {
                        String rmv = s.substring(left,left + letcount);
                        curop.put(rmv, curop.get(rmv) - 1);
                        c--;
                        left += letcount;
                    }

                    if(c == wordcount)
                    {
                       res.add(left);
                    }
                }
                else
                {
                    curop.clear();
                    left = j + letcount;
                    c = 0;
                }
            }    
        }
        return res;
    }
}