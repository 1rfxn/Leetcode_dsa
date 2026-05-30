class Solution {
    public int diagonalSum(int[][] mat) {
      int num = mat[0].length;
      int i = 0;
      int sum = 0;
      while(i < num)
      {
        sum += mat[i][i];
        sum += mat[i][num - 1 - i];
        i++;
      }
      if(num % 2 == 1)
        sum -= mat[num / 2][num / 2];
      return sum;
    }
}