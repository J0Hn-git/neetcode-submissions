class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            // Convert 1D index into 2D position.
            int row = mid / cols;    
            int col = mid % cols;

            int current = matrix[row][col];

            if(target == current) {
                return true;
            }
            else if (target > current) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
