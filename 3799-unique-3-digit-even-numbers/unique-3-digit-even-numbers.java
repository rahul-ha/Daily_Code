class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int arr[] = new int[10];
        for(int i =0;i<n;i++){
            int a = digits[i];
            arr[a]++;
        }
        int count = 0;
        for(int i =100;i<1000;i++){
            if(i%2!=0) continue;
            int k = i;
            int a = k%10;
            k= k/10;
            int b = k%10;
            k= k/10;
            int c = k%10;
            int need [] = new int[10];
            need[a]++;
            need[b]++;
            need[c]++;
            boolean bb = true;
            for(int j =0;j<10;j++){
                if(need[j]>arr[j]) {
                    bb = false;
                    break;
                }
            }
            if(bb) count++;
        }
        return count;
    }
}