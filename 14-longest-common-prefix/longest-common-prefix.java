class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        int i = 0;
        String ans = "";
        String a = arr[0];
        String b = arr[arr.length-1];
        int min = Math.min(a.length(),b.length());
        while(i<min){
            if(a.charAt(i)!=b.charAt(i)) break;
            ans+=a.charAt(i);
             i++;
        }
        return ans;
    }
}