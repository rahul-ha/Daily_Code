class Solution {
    public boolean isItPossible(String s1, String s2) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char c : s1.toCharArray()){
            arr1[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            arr2[c-'a']++;
        }
        int dis1 = 0;
        int dis2 = 0;
        for(int i =0;i<26;i++){
            if(arr1[i]>0) dis1++;
            if(arr2[i]>0) dis2++;
        }
        for(int i =0;i<26;i++){
            for(int j =0;j<26;j++){
                if(arr1[i]==0 || arr2[j]==0) continue;
                int n1 = dis1;
                int n2 = dis2;
                if(i!=j){
                    if(arr1[i]==1) n1--;
                    if(arr2[i]==0) n2++;
                    if(arr2[j]==1) n2--;
                    if(arr1[j]==0) n1++;
                }
                if(n1==n2) return true;
            }
        }
        return false;
    }
}