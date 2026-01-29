class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int arr[] = new int[deck.length];
        Arrays.fill(arr,0);
        int i =0;
        int j = 0;

        boolean skip = false;
        while(i<deck.length){
            if(arr[j]==0){
                if(skip==false){
                     arr[j] = deck[i];
                i++;
                }
                skip = !skip;
            }
           
            j = (j+1)%deck.length;
        }
        return arr;
    }
}