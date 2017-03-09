package science.duanxu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 463. Island Perimeter
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    perimeter += (i - 1 < 0 || grid[i-1][j] == 0) ? 1 : 0;
                    perimeter += (i + 1 >= rows || grid[i+1][j] == 0) ? 1 : 0;
                    perimeter += (j - 1 < 0 || grid[i][j-1] == 0) ? 1 : 0;
                    perimeter += (j + 1 >= cols || grid[i][j+1] == 0) ? 1 : 0;
                }
            }
        }
        return perimeter;
    }
}
