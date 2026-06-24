class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int size = 2 * m;

        long[][] T = new long[size][size];

        // newUp[v] = sum down[u] where u < v
        for (int v = 1; v <= m; v++) {
            int row = v - 1;

            for (int u = 1; u < v; u++) {
                int col = m + (u - 1);
                T[row][col] = 1;
            }
        }

        // newDown[v] = sum up[u] where u > v
        for (int v = 1; v <= m; v++) {
            int row = m + (v - 1);

            for (int u = v + 1; u <= m; u++) {
                int col = u - 1;
                T[row][col] = 1;
            }
        }

        long[] base = new long[size];

        // length = 2
        for (int v = 1; v <= m; v++) {
            base[v - 1] = v - 1;      // up
            base[m + v - 1] = m - v;  // down
        }

        long[][] P = matrixPower(T, n - 2);

        long[] state = multiply(P, base);

        long ans = 0;
        for (long x : state) {
            ans = (ans + x) % MOD;
        }

        return (int) ans;
    }

    private long[][] matrixPower(long[][] A, long exp) {
        int n = A.length;

        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = multiply(res, A);
            }

            A = multiply(A, A);
            exp >>= 1;
        }

        return res;
    }

    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;

                long aik = A[i][k];

                for (int j = 0; j < n; j++) {
                    if (B[k][j] == 0) continue;

                    C[i][j] = (C[i][j] + aik * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }

    private long[] multiply(long[][] A, long[] v) {
        int n = A.length;
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) continue;

                sum = (sum + A[i][j] * v[j]) % MOD;
            }

            res[i] = sum;
        }

        return res;
    }
}