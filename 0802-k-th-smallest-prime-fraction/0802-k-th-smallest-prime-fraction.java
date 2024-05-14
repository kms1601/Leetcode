class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Set<Fraction> set = new TreeSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(new Fraction(arr[i], arr[j]));
            }
        }

        int i = 1;
        for (Fraction f : set) {
            if (i == k) {
                return f.toArr();
            }
            i++;
        }
        return null;
    }

    static class Fraction implements Comparable<Fraction> {
        int p, q;

        Fraction(int p, int q) {
            this.p = p;
            this.q = q;
        }

        @Override
        public int compareTo(Fraction f) {
            return Integer.compare(this.p * f.q, this.q * f.p);
        }

        public int[] toArr() {
            return new int[]{p, q};
        }
    }
}