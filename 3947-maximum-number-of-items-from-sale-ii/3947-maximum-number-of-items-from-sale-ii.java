import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] cnt = new int[n + 1];
        long m = Long.MAX_VALUE;
        for (int[] it : items) {
            cnt[it[0]]++;
            if (it[1] < m) m = it[1];
        }
        int[] mult = new int[n + 1];
        for (int f = 1; f <= n; f++) {
            int s = 0;
            for (int k = f; k <= n; k += f) s += cnt[k];
            mult[f] = s;
        }
        long[] arr = new long[n];
        int sz = 0;
        for (int[] it : items) {
            if (it[1] < 2 * m) arr[sz++] = ((long) it[1] << 17) | (mult[it[0]] - 1);
        }
        Arrays.sort(arr, 0, sz);
        long rem = budget;
        long total = 0;
        for (int i = 0; i < sz; i++) {
            long p = arr[i] >> 17;
            long d = arr[i] & 131071L;
            long t = Math.min(d, rem / p);
            total += 2 * t;
            rem -= t * p;
            if (t < d) break;
        }
        return (int) (total + rem / m);
    }
}