class Solution {
    public String convertToBase7(int num) {
        if(num == 0)
        return "0";
        String res = "";
        boolean sign = (num >= 0);
        num = Math.abs(num);
        while(num != 0)
        {
            res = (num % 7)+"" + res;
            num /= 7;
        }
        if(sign)
        return res;
        else
        return "-"+res;
    }
}