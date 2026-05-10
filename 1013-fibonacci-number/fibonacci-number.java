class Solution {
    public int fib(int n) {
        int a = 0,b = 1,c = 0;
        int count = 1;
        if(n == a)
        return a;
        if(n == b)
        return b;
        while(count < n)
        {
        c = a + b;
        a = b;
        b = c;
        count++;
        }
        return c;
    }
}