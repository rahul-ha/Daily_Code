class Solution {
    public int[] executeInstructions(int n, int[] arr, String s) {
        int ans[] = new int[s.length()];
      
        for(int i =0;i<s.length();i++){
              int row = arr[0];
              int col = arr[1];
            int  count = 0;
            for(int j =i;j<s.length();j++){
                if(s.charAt(j)=='R') col++;
                if(s.charAt(j)=='L') col--;
                if(s.charAt(j)=='U') row--;
                if(s.charAt(j)=='D') row++;
                if(col<0 || row<0 || row>=n || col>=n) break;
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}