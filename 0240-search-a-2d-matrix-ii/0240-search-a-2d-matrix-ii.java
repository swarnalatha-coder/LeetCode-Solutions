class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                      return false;
                              }

                                      // start from top-right corner
                                              int row = 0;
                                                      int col = matrix[0].length - 1;

                                                              // keep searching while inside matrix boundaries
                                                                      while (row < matrix.length && col >= 0) {
                                                                                  if (matrix[row][col] == target) {
                                                                                                  // found the target
                                                                                                                  return true;
                                                                                                                              }
                                                                                                                                          if (matrix[row][col] < target) {
                                                                                                                                                          // move down to bigger numbers
                                                                                                                                                                          row++;
                                                                                                                                                                                      } else {
                                                                                                                                                                                                      // move left to smaller numbers
                                                                                                                                                                                                                      col--;
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                  // target not found
                                                                                                                                                                                                                                                          return false;
        
    }
}