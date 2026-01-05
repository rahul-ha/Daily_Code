class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        HashMap<Integer, List<Integer>> rev = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rev.put(i, new ArrayList<>());
        }
        int[] in = new int[n];

        // build reverse graph 
        for (int i = 0; i < n; i++) {
            for (int v : graph[i]) {
                rev.get(v).add(i);   // reverse edge
                in[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        HashSet<Integer> safe = new HashSet<>();

        // topological sort
        while (!q.isEmpty()) {
            int node = q.poll();
            safe.add(node); // add safe because remove when it indegree is zero no cycle

            for (int prev : rev.get(node)) {
                in[prev]--;
                if (in[prev] == 0) {
                    q.add(prev);
                }
            }
        }

        List<Integer> ans = new ArrayList<>(safe);
        Collections.sort(ans);

        return ans;
    }
}
