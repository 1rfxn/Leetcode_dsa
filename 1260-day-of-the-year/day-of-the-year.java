class Solution {
    public int dayOfYear(String date) {
        String d[] = date.split("-");
        int y = Integer.parseInt(d[0]);
        int m = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        int res = 0;
        for(int i = 1 ; i < m ; i++)
        {
            if(i == 2)
                res += 28;
            else if((i <= 7 && (i % 2 == 1)) || (i >= 8 && i % 2 == 0))
            {
                res += 31;
            }
            else
            {
                res += 30;
            }
        }
        res += day;
        if((m > 2) && ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)))
        return res + 1;
        else
        return res;
    }
}