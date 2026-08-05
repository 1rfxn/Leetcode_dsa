class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] cl = score.clone();
        Arrays.sort(cl);
        String[] res = new String[score.length];
        for(int i = 0 ; i < cl.length ; i++)
        {
            for(int j = 0 ; j < score.length ; j++)
            {
                if(cl[i] == score[j])
                {
                    int r = cl.length - i;
                    if(r == 1)
                        res[j] = "Gold Medal";
                    else if(r == 2)
                        res[j] = "Silver Medal";
                    else if(r == 3)
                        res[j] = "Bronze Medal";
                    else
                        res[j] = (r+"");
                }
            }
        }
        return res;
    }
}