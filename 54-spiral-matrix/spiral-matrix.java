class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int ryt = matrix[0].length - 1;
        int top = 0;
        int btm = matrix.length - 1;
        while(left <= ryt && top <= btm)
        {
            for(int i = left ; i <= ryt ; i++)
                res.add(matrix[top][i]);
            top++;
            for(int i = top ; i <= btm ; i++)
                res.add(matrix[i][ryt]);
            ryt--;
            if(top <= btm)
            {
            for(int i = ryt ; i >= left ; i--)
                res.add(matrix[btm][i]);
            }
            btm--;
            if(left <= ryt)
            {
            for(int i = btm ; i >= top ; i--)
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}