import java.util.*;

class Solution {

    private int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int best = 1, curr = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                curr++;
            } else if (arr[i] != arr[i - 1]) {
                curr = 1;
            }
            best = Math.max(best, curr);
        }
        return best;
    }

    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int Lh = longestConsecutive(hBars);
        int Lv = longestConsecutive(vBars);

        int maxH = Lh + 1;
        int maxV = Lv + 1;

        int side = Math.min(maxH, maxV);
        return side * side;
    }
}
