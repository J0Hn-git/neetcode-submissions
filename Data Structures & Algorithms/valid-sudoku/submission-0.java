public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                if (current != '.') {
                    String rowkey = "row" + i + current;
                    String colkey = "col" + j + current;
                    String boxkey = "box" + (i/3) + (j/3) + current;

                    if (!seen.add(rowkey) || !seen.add(colkey) || !seen.add(boxkey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
