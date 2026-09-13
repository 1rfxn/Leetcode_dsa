class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        while(l <= r)
        {
            int m = (l + r) / 2;
            int ro = m / matrix[0].length;
            int co = m % matrix[0].length;
            if(matrix[ro][co] == target)
                return true;
            if(matrix[ro][co] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
}