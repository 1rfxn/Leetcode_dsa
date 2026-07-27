class Solution {
    List<String> res = new ArrayList<>();
    String[] m = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0)
        return res;
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String digits, int idx, StringBuilder cur)
    {
        if(idx == digits.length())
        {
        res.add(cur.toString());
        return;
        }

        String let = m[digits.charAt(idx) - '0'];
        for(int i = 0 ; i < let.length() ; i++)
        {
            cur.append(let.charAt(i));
            backtrack(digits, idx + 1, cur);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}