class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) return false;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) return false;
        int deal = sum / 3; 
        int p = 0;
        int q = A.length - 1;
        int s1 = A[p];
        int s2 = A[q];
        while(p != q) {
            if (s1 == deal && s2 == deal) break;
            if (s2 != deal) {
                q--;
                s2 += A[q];
            }
            if (s1 != deal) {
                p++;
                s1 += A[p];
            } 
        }   
        if (q - p <= 1) return false;
        int s3 = 0;
        for (int i = p + 1; i < q; i++) {
            s3 += A[i];
        }
        if (s3 == deal)  return true;
        return false;
    }
}
