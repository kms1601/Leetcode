class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;

        PriorityQueue<int[]> projectList = new PriorityQueue<>((p1, p2) -> Integer.compare(p1[1], p2[1]));
        PriorityQueue<int[]> canStart = new PriorityQueue<>((p1, p2) -> Integer.compare(p2[0], p1[0]));

        for (int i = 0; i < n; i++) {
            projectList.offer(new int[]{profits[i], capital[i]});
        }

        for (int i = 0; i < k; i++) {
            while (!projectList.isEmpty() && projectList.peek()[1] <= w) {
                canStart.offer(projectList.poll());
            }

            if (canStart.isEmpty()) break;
            w += canStart.poll()[0];
        }
        return w;
    }
}