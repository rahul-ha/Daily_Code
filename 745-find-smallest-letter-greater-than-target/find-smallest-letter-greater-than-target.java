class Solution {
    public char nextGreatestLetter(char[] letter, char target) {
        char ans = letter[0];
        int i =0;
        int j =  letter.length-1;
        int b = target-'a';
        while(i<=j){
            int mid = (i+j)/2;
            int a  = letter[mid]-'a';
            if(a>b){
                ans = letter[mid];
                j = mid-1;
            }
            else {
                i = mid+1;
            }
        }
        return ans;
    }

}