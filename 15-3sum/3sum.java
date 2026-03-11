class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        int j =0;
        int k = arr.length-1;
        while(i<arr.length-2){
            List<Integer> al = new ArrayList<>();
            while(i>0 && arr[i]==arr[i-1] && i<arr.length-2){
                i++;
            }
             al.add(arr[i]);
            j = i+1;
            check(j,k,al,arr,-arr[i],ans);
            i++;
        }
        return ans;
    }
    public void check(int j,int k,List<Integer> al,int arr[],int tar,List<List<Integer>> ans){
         int sum = 0;
         while(j<k){
            sum = arr[j] +arr[k];
            if(sum==tar){
          while(j<k && arr[j]==arr[j+1]) j++;
           while(j<k && arr[k]==arr[k-1]) k--; 
           al.add(arr[j]);
           al.add(arr[k]);
            ans.add(new ArrayList<>(al));
           al.remove(al.size()-1);
           al.remove(al.size()-1);
           j++;
           k--;
           }
          else if(sum>tar) k--;
          else j++;
         }
    }
}