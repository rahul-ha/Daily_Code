class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        for(int i =1;i<=8;i++)
        q.add(i);
        while(!q.isEmpty()){
            int a =  q.poll();
            int b =  a%10;
            if(b==9) continue;
            int c = a*10 + b+1;
            if( c<= high)
            q.add(c);
            if(c>=low && c<=high)
            al.add(c);

        }
        return al;
    }
}