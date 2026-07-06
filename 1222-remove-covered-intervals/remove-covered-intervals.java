class Solution {
    public int removeCoveredIntervals(int[][] arr) {
       Arrays.sort(arr, (a, b) -> {
    if (a[1] != b[1]) {
        return Integer.compare( b[1],a[1]); // first sort by index 1
    }
    return Integer.compare(a[0], b[0]);     // then sort by index 0
});
        int ans = 0;
        int s = arr[0][0];
        int e = arr[0][1];
        for(int i =1;i<arr.length;i++){
            int s1 = arr[i][0];
            int e2 = arr[i][1];
            if(s1>=s && e2<=e)
            ans++;
            else {
                s = s1;
                e = e2;
            }
        }
        return arr.length-ans;
    }
}