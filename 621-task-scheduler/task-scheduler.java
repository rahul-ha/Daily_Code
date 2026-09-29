import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq) {
            if (f > 0) {
                pq.offer(f);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            // Try to execute n + 1 different tasks
            for (int i = 0; i <= n; i++) {

                if (!pq.isEmpty()) {
                    int freqTask = pq.poll();

                    freqTask--;

                    if (freqTask > 0) {
                        temp.add(freqTask);
                    }

                    time++;
                } else {
                    // No task available
                    if (temp.isEmpty()) {
                        break;
                    }

                    time++;
                }
            }

            // Put remaining tasks back
            for (int f : temp) {
                pq.offer(f);
            }
        }

        return time;
    }
}