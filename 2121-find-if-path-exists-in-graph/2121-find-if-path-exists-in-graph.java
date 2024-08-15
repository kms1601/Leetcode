class Solution {
    List<List<Integer>> vertexes = new ArrayList<>();
    boolean[] visit;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for (int i = 0; i < n; i++)
            vertexes.add(new ArrayList<>());

        for (int[] edge : edges) {
            int p = edge[0];
            int q = edge[1];
            vertexes.get(p).add(q);
            vertexes.get(q).add(p);
        }

        Deque<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[n];
        queue.offer(source);
        visit[source] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == destination) return true;
            for (int next : vertexes.get(cur)) {
                if (visit[next]) continue;
                queue.offer(next);
                visit[next] = true;
            }
        }
        return false;
    }
}