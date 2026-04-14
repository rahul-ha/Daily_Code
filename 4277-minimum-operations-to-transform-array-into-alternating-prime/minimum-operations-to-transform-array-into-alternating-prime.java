class Solution {
    public int minOperations(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            int n = nums[i];
            boolean a = true;
            while(a){
                if(i%2==0 && check(n)){
                    a = false;
                }
                else if(i%2!=0 && !check(n)){
                    a = false;
                }
                else{
                    n++;
                    count++;
                }
            }
        }
            return count;
        }

        public boolean check(int n){
            if(n<=1) return false;
           // if(n==2) return true;
            for(int i =2;i*i<=n;i++){
                if(n%i==0) return false;
            }   
            return true;         
        }

    
}