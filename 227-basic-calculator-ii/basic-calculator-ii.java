class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        int num = 0;
        char sign = '+';
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                num = num * 10 + (c - '0');
            }
            if(!Character.isDigit(c) && c != ' ' || i == s.length() - 1)
            {
                if(sign == '+')
                stk.push(num);
                else if(sign == '-')
                stk.push(-num);
                else if(sign == '*')
                stk.push(stk.pop() * num);
                else if(sign == '/')
                stk.push(stk.pop() / num);

                sign = c;
                num = 0;
            }
        }
        int res = 0;
        for(int ele : stk)
        {
            res += ele;
        }
        return res;
    }
}