class Solution {
    public int minimumPushes(String word) {
         Integer arr[] = new Integer[26];
        Arrays.fill(arr, 0);
        for(char w : word.toCharArray()){
            arr[w-'a']++;
        }
        int ans = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0;i<26;i++){
            if(i<=7){
                ans = ans+ arr[i];
            }
            else if (i>7&& i<16){
                ans = ans+ (arr[i]*2);
            }
            else if(i>=16 && i<=23){
                ans =  ans+(arr[i]*3);
            }
            else {
                ans =  ans+(arr[i]*4);
            }
        }
        return ans;

    }
}