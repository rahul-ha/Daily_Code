class Solution {
    public int ladderLength(String st, String en, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(en)) return 0;
        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(st);
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                String a = q.poll();
                if(visited.contains(a)) continue;
                visited.add(a);
                if(a.equals(en)) return count+1;
                List<String> neg = new ArrayList<>();
                for(int k =0;k<a.length();k++){
                    for(char j = 'a';j<='z';j++){
                        String b = a.substring(0,k) + j + a.substring(k+1,a.length());
                        if(set.contains(b) && !b.equals(st)){
                            neg.add(b);}
                        }
                    }

                    for(String al : neg){
                        if(!visited.contains(al)){
                            q.add(al); 
                            //set.remove(al);
                            } }
                           
            }
             count++;
            
        }
        return 0;
    }
}