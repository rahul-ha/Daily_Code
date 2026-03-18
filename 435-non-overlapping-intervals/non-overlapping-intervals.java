class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)-> Integer.compare(a[1],b[1]));
    
   // int st = 0;
    int en = Integer.MIN_VALUE;
    int count = 0;
    for(int cur[]:arr){
        if(en<=cur[0]){
            en = cur[1];
            count++;
        }
        else continue;}
    
    return arr.length-count;
    }
}