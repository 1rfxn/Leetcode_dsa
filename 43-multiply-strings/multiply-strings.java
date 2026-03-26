class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
        return "0";
        int n = num1.length(), m = num2.length();
        int a[] = new int[m + n];
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            for(int j = m - 1 ; j >= 0 ; j--)
            {
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                int res = x * y;
                int sum = a[i + j + 1] + res;
                a[i + j] += sum / 10;
                a[i + j + 1] = sum % 10;
            }
        }
        String ans = "";
        int i = 0;
        while(i < a.length)
        {
            if(!(a[i] == 0 && ans.length() == 0))
            {
                ans += a[i];
            }
            i++;
        }
        return ans;
    }
}