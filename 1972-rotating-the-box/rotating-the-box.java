class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        // Step 1: simulate gravity (right side)
        for (int i = 0; i < m; i++) {
            int emptyPos = n - 1;

            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    emptyPos = j - 1; // reset after obstacle
                } 
                else if (boxGrid[i][j] == '#') {
                    char temp = boxGrid[i][emptyPos];
                    boxGrid[i][emptyPos] = '#';
                    boxGrid[i][j] = temp;
                    emptyPos--;
                }
            }
        }

        // Step 2: rotate 90 degree clockwise
        char[][] res = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return res;
    }
}