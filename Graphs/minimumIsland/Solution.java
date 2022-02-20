package Graphs.minimumIsland;

import java.util.HashSet;

public class Solution {
    
    HashSet<String> visited = new HashSet<>();
    public int minimumIsland(char[][] grid){

        int minimumIslandSize = Integer.MAX_VALUE;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                int size = exploreIslands(i, j, grid);
                if( size !=0 ){
                    minimumIslandSize = Math.min(minimumIslandSize, size);
                }
                
            }
        }

        return minimumIslandSize;
    }

    public int exploreIslands(int row, int col, char[][] grid) {
        String key = row+","+col;
        if(visited.contains(key)){
            return 0;
        }
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return 0;
        }
        int islandSize = 0;
        if(grid[row][col] == 'L'){
            visited.add(key);
            islandSize = 1 + exploreIslands(row+1, col, grid) + exploreIslands(row-1, col, grid) + exploreIslands(row, col+1, grid) + exploreIslands(row, col-1, grid);
        }
        
        return islandSize;
    }
    public static void main(String[] args) {

        char[][] grid = {
            {'W', 'L', 'W', 'W', 'W'},
            {'W', 'L', 'W', 'W', 'W'},
            {'W', 'W', 'W', 'L', 'W'},
            {'W', 'W', 'L', 'L', 'W'},
            {'L', 'W', 'W', 'L', 'L'},
            {'L', 'L', 'W', 'W', 'W'},
        };
        
        System.out.println(new Solution().minimumIsland(grid));
    }
}
