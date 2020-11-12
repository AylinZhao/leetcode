class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        int x = 2;
        while (x < n) {
            if (judge(x)) {
                cnt++;
            }
            x++;
        }
        return cnt;
    }
    public boolean judge(int k) {
        int c = 2;
        while (c * c <= k) {
            if (k % c != 0) {
                c++;
                continue;
            } else return false;
        }
        return true;
    }
}
