class Solution {
    public int totalSteps(int[] nums) {
        int ans = 0;
        Deque<int[]> stack = new ArrayDeque<>();
        for(int num : nums){
            int step = 0;
            while(!stack.isEmpty() && stack.peek()[0]<=num)
            step = Math.max(step,stack.pop()[1]);

            if(!stack.isEmpty()) step++;
            else step = 0;

            ans = Math.max(ans,step);
            stack.push(new int[]{num,step});
        }
        return ans;
    }
}