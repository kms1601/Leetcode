class Solution {
    public int findCenter(int[][] edges) {
        int p = edges[0][0];
        int q = edges[0][1];
        if (p == edges[1][0] || p == edges[1][1]) return p;
        return q;
    }
}