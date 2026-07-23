class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = 0;
        int ele = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > ele)
            {
                ele = arr[i];
                max = i;
            }
        }
        if(max == 0 || max == arr.length - 1)
            return false;
        for(int i = max ; i < arr.length - 1 ; i++)
        {
            if(arr[i] <= arr[i + 1])
                return false;
        }
        for(int i = max ; i > 0 ; i--)
        {
            if(arr[i] <= arr[i - 1])
                return false;
        }
        return true;
    }
}