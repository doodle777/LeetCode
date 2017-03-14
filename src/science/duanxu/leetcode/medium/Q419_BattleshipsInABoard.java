package science.duanxu.leetcode.medium;

/**
 * 419. Battleships in a Board
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q419_BattleshipsInABoard {
    private final int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public int countBattleships(char[][] board) {
        if (board.length == 0) return 0;

        int M = board.length;
        int N = board[0].length;
        int countS = 0, countD = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 'X') {
                    int count = 0;
                    for (int d = 0; d < 4; d++) {
                        int nextI = i + dir[d][0];
                        int nextJ = j + dir[d][1];

                        if (nextI >= 0 && nextI < M && nextJ >= 0 && nextJ < N
                                && board[nextI][nextJ] == 'X') {
                            count++;
                        }
                    }

                    if (count == 0) countS++;
                    if (count == 1) countD++;
                }
            }
        }

        return countS + countD / 2;
    }
}