class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
         map.put(c,map.getOrDefault(c,0)+1);
        }
       int a = map.getOrDefault('a',0);
       int b = map.getOrDefault('b',0);
       int c = map.getOrDefault('l',0)/2;
       int d = map.getOrDefault('o',0)/2;
       int e = map.getOrDefault('n',0);
       return Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));


    }
}