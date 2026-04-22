class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int spot = flowerbed.length;
        for(int i = 0 ; i < flowerbed.length ; i++)
        {
            if(flowerbed[i] == 0)
            {
                int pre = (i == 0) ? 0 : flowerbed[i - 1];
                int nxt = (i == spot - 1) ? 0 : flowerbed[i + 1];
                if(pre == 0 && nxt == 0)
                {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}