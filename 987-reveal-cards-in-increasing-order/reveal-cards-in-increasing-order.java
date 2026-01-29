
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int arr[] = new int[deck.length];
        Arrays.fill(arr,0);
       Deque<Integer> dq = new ArrayDeque<>();
       for(int i =0;i<deck.length;i++){
        dq.add(i);
       }
       int i =0;
       while(i<deck.length){
        int a = dq.pollFirst();
        arr[a] = deck[i];
        if(!dq.isEmpty()){
               int b  = dq.pollFirst();
        dq.addLast(b);
        }
     
        i++;
       }

      return arr;
}}
