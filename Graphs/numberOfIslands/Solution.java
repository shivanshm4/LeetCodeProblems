package Graphs.numberOfIslands;

import java.util.HashSet;

public class Solution {
    HashSet<String> visited = new HashSet<>();
    public int numIslands(char[][] grid) {
        
        int numberOfIslands = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    if(isIsland(i, j, grid)){
                     numberOfIslands++;   
                    }
                }
            }
        }
        
        return numberOfIslands;
    }
    
    public boolean isIsland(int row, int col, char[][] grid){
        String key = row+","+col;
        if(visited.contains(key)){
            return false;
        }
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return false;
        }
        if(grid[row][col] == '1'){
            visited.add(key);
            isIsland(row+1, col, grid);
            isIsland(row-1, col, grid);
            isIsland(row, col+1, grid);
            isIsland(row, col-1, grid);
            return true;    
        }
        
        return false;
    }

    public static void main(String[] args) {
 //       char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}; // => 1
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println(new Solution().numIslands(grid));
    }
}
