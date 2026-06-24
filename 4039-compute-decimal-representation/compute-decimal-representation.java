class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int c = 1;
        while(n>0){
            int a = n%10;
            n = n/10;
            int k = a*c;
            c = c*10;
            if(k>0)
            al.add(k);
        }
        Collections.sort(al);
        int arr[] = new int[al.size()];
        int j = 0;
        for(int i  = al.size()-1;i>=0;i--)
        arr[j++] = al.get(i);

        return arr;
    }
}