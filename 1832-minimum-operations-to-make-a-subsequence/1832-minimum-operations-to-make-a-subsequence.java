class Solution {
    public int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }

        List<Integer> toIndex = new ArrayList<>();
        for (int a : arr) {
            if (!map.containsKey(a)) continue;
            toIndex.add(map.get(a));
        }
        
        List<Integer> lis = new ArrayList<>();
        if (toIndex.size() == 0) {
            return target.length;
        }
        
        lis.add(toIndex.get(0));
        for (int i = 1; i < toIndex.size(); i++) {
            int index = toIndex.get(i);
            if (lis.get(lis.size() - 1) < index) {
                lis.add(index);
                continue;
            }

            int left = 0, right = lis.size() - 1;
            while (left <= right) {
                int mid = (left + right) / 2;

                if (lis.get(mid) >= index) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            lis.set(left, index);
        }
        return target.length - lis.size();
    }
}