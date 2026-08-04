class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        //for (i = 0; i<matrix.length - 1; i++) {
        while (i < matrix.length && j >= 0){
            System.out.println("ran");
            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                j--;
            }
            else if (matrix[i][j] < target) {
                i++;
            }
         }
        return false;
    }
}