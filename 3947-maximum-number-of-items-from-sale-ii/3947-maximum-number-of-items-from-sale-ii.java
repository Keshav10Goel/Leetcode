import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] cnt = new int[n + 1];
        for (int[] it : items) cnt[it[0]]++;
        long[] mult = new long[n + 1];
        for (int f = 1; f <= n; f++) {
            for (int k = f; k <= n; k += f) mult[f] += cnt[k];
        }
        long[][] arr = new long[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = items[i][1];
            arr[i][1] = mult[items[i][0]] - 1;
        }
        Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));
        long m = arr[0][0];
        long rem = budget;
        long total = 0;
        for (int i = 0; i < n; i++) {
            long p = arr[i][0], d = arr[i][1];
            if (p >= 2 * m) break;
            long t = Math.min(d, rem / p);
            total += 2 * t;
            rem -= t * p;
            if (t < d) break;
        }
        return (int)(total + rem / m);
    }
}