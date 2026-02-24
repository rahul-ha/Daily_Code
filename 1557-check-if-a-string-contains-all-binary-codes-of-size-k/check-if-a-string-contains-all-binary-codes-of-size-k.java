class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i =0;i<=s.length()-k;i++){
            String a = s.substring(i,i+k);
            if(!set.contains(a))
            set.add(a);
        }
        int a = set.size();
        int b =(int) Math.pow(2,k);
        return a==b;
    }
}