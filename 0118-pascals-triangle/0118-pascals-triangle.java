class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            List<Integer> before = pascal.get(i - 2);

            cur.add(1);
            for (int j = 0; j < i - 2; j++) {
                cur.add(before.get(j) + before.get(j + 1));
            }
            cur.add(1);
            pascal.add(cur);
        }

        return pascal;
    }
}