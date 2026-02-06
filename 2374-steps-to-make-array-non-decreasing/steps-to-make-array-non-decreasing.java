class Solution {
    public int totalSteps(int[] nums) {

        int n = nums.length;
        int ans = 0;

        // stack stores {value, steps}
        Deque<int[]> stack = new ArrayDeque<>();

        for (int num : nums) {
            int steps = 0;

            // pop all elements <= current
            while (!stack.isEmpty() && stack.peek()[0] <= num) {
                steps = Math.max(steps, stack.pop()[1]);
            }

            // if stack not empty, it means left bigger exists
            if (!stack.isEmpty()) {
                steps += 1;
            } else {
                steps = 0;
            }

            ans = Math.max(ans, steps);
            stack.push(new int[]{num, steps});
        }

        return ans;
    }
}