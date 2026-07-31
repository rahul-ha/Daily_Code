class Solution {
    int max1 = 0;
    int max2 = 0;
    public int[][] findFarmland(int[][] land) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i =0;i<land.length;i++){
            for(int j = 0;j<land[0].length;j++){
                if(land[i][j]==1){
                    List<Integer> a = new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    max1 = i;
                    max2 = j;
                    cal(i,j,land);
                    a.add(max1);
                    a.add(max2);
                    al.add(a);
                }
            }
        }
        int ans[][] = new int[al.size()][4];
        for(int i =0;i<al.size();i++){
            for(int j =0;j<4;j++){
                ans[i][j] = al.get(i).get(j);
             }
        }
        return ans;
    }
    public void cal(int i, int j , int land[][]){
        if(i<0 || j<0 || i==land.length || j== land[0].length || land[i][j]==0)
        return;
        land[i][j] = 0;
        max1 = Math.max(max1,i);
        max2 = Math.max(max2,j);
        cal(i+1,j,land);
        cal(i,j+1,land);
        cal(i-1,j,land);
        cal(i,j-1,land);
    }

}