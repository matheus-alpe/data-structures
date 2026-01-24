package org.example.algorithms.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NumberOfIslands {
    // https://leetcode.com/problems/number-of-islands/
    public int mySolutionNumIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Set<String> visited = new HashSet<>();


        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1' && !visited.contains(cellKey(r, c))) {
                    islands++;
                    bfs(grid, r, c, visited, directions, rows, cols);
                }
            }
        }

        return islands;
    }

    private void bfs(char[][] grid, int r, int c, Set<String> visited, int[][] directions, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        visited.add(cellKey(r, c));
        queue.add(new int[]{r, c});

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                boolean withinBounds = newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols;

                if (withinBounds && grid[newRow][newCol] == '1' && !visited.contains(cellKey(newRow, newCol))) {
                    visited.add(cellKey(newRow, newCol));
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
    }

    private String cellKey(int r, int c) {
        return String.format("%dx%d", r, c);
    }

    /**
     * Best solution
     */
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int i, int j) {

        // Boundary or water check
        if (i < 0 || j < 0 ||
                i >= grid.length || j >= grid[0].length ||
                grid[i][j] == '0') {
            return;
        }

        // Mark visited
        grid[i][j] = '0';

        // Explore 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}
