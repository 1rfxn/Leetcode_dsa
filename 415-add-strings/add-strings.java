class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int c = 0,bor = 0;
        String res = "";
        while(i >= 0 || j >= 0 || bor != 0)
        {int a = 0,b = 0;
            if(i >= 0)
            {
            a = num1.charAt(i) - '0';
            i--;
            }
            if(j >= 0) {
            b = num2.charAt(j) - '0';
            j--;
            }
            c = a+b+bor;
            bor = (c > 9) ? 1 : 0;
            res = (c%10+"") + res;
        }
        return res;
    }
}