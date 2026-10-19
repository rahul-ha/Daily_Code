class Solution {
    public String convert(String s, int n) {
        StringBuilder arr[] = new StringBuilder[n];
        int dir = 1;
        int row = 0;
        if(n==1 || s.length()<=n) return s;
        for(int i =0;i<n;i++){
            arr[i] = new StringBuilder();
        }
        for(int i =0;i<s.length();i++){
            arr[row].append(s.charAt(i));
            if(row==n-1){
                dir = -1;
            }
            else if(row==0){
                dir = 1;
            }
            row+=dir;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}