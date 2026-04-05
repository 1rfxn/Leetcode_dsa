class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int i = 0;
        int sign = 1;
        while(i < s.length() && (s.charAt(i) == ' '))
            i++;

        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
        {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i)))
        {
            int num = s.charAt(i) - '0';
            if(res > (Integer.MAX_VALUE - num) / 10)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + num;
            i++;
        }
        return res * sign;
    }
}