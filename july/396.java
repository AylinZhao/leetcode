class Solution {
    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) return 0;
        int N = A.length;
        int base = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            base += A[i] * i;
        }
        int max = base;
        int current = 0;
        // System.out.println("current max value : " + base);
        for (int j = N - 1; j > 0; j--) {
            current =  base + (sum - A[j] * N);
            // System.out.println("current max value : " +current);
            max = Math.max(current, max);
            base = current;
        }
        return max;
    }
}