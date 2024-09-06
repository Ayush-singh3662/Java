class Solution {
    public long minDamage(int power, int[] damage, int[] health) {
        int n = damage.length;
        long res = 0L;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, new Comparator<Integer>() {
            public int compare(int a, int b) {
                int timeA = (int) Math.ceil((double) health[a] / power);
                int timeB = (int) Math.ceil((double) health[b] / power);
                return Integer.compare(damage[b] * timeA, damage[a] * timeB);
            }
        });
        long curr = 0;
        for (int i = 0; i < n; i++) {
            int j = idx[i];
            int p = (int) Math.ceil((double) health[j] / power);
            res += damage[j] * (curr + p);
            curr += p;
        }
        return res;
    }
}
