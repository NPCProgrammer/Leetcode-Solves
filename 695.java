class Solution {
    boolean seen[][];
    
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        int row = grid.length;
        int col = grid[0].length;
        seen = new boolean[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                max_area = Math.max(max_area, area(i, j, grid));
            }
        }
        return max_area;
    }
    public int area(int row, int col, int[][] grid){
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || seen[row][col] || grid[row][col] == 0 ) {
            return 0;
        }
        seen[row][col] = true;
        
        return (1 + area(row+1,col,grid) + area(row-1,col,grid) + area(row,col+1,grid) + area(row,col-1,grid));
    }
    
    }
