class Solution {
    public int findNthDigit(int n) {
        if (n <= 9) return n;
        int d = 0;
        int sum = 0;
        int tenpower = 1;
        int presum = 0;
        int preten = 1;
        while (n > sum) {
        	d = d + 1; 
        	presum = sum;
        	preten = tenpower;
        	if (sum > (Integer.MAX_VALUE / 9) || tenpower > (Integer.MAX_VALUE / 10)) {
        		break;
        	}
        	sum += tenpower * 9 * d;
        	tenpower = tenpower * 10;
        }
        n = n - presum;
        int row = ((n - 1) / d) + 1; 
        int res = preten + row - 1;
        int line = n - (row - 1) * d;
        ArrayList<Integer> l = new ArrayList<>();
        while (res != 0) {
            int bit = res % 10;
            res = res / 10;
            l.add(bit);
        }
        return l.get(l.size() - line);
    }
}