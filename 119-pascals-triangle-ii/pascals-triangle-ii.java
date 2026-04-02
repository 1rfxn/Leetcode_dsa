class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long ele = 1;
        for(int i = 0 ; i <= rowIndex ; i++)
        {
            res.add((int)ele);
            ele = ele * (rowIndex - i) / (i + 1);
        }
        return res;
    } 
}