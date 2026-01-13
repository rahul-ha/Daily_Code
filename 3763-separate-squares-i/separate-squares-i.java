class Solution {
    public double separateSquares(int[][] arr) {
        double total = 0;
        double ans = 0;
        double low = 0;
        double high = 0;
         for(int row[]: arr){
              total+= (double)row[2]*row[2];
            high = Math.max(high, row[1] + row[2]);
        }

         while(high-low > 1e-6){ // it can save time acc to given condition
            double mid = (low+high)/2;
            double c = cal(arr,mid);
            if(c>=total/2){
                high = mid;
                ans = mid;
            }

            else 
            low = mid;
         }
         return ans;
    }
    public double cal(int arr[][] ,double midy){
        double ans = 0;
        for(int row[]: arr){
            double low = row[1];
            double top = row[1]+row[2];
            if(midy>=top)
            ans+= (double)row[2]*row[2];
            else if(midy > low)
            ans+= (double)row[2]*(midy-row[1]);
            else continue;
        }
        return ans;
    }
}