class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0,j = c.length - 1;
        String match = "aeiouAEIOU";
        while(i < j)
        {
            while(i < j && !match.contains(c[i]+""))
            i++;
            while(i < j && !match.contains(c[j]+""))
            j--;
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return String.copyValueOf(c);
}
}