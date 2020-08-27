class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix  == null || matrix.length == 0) return new int[0];
        ArrayList<ArrayList<Integer>> record = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int row = 0;
            int col = i;
            ArrayList<Integer> l = new ArrayList<>();
            l.add(matrix[row][col]);
            while ((++row) < matrix.length && (--col) >= 0) {
                l.add(matrix[row][col]);
            }
            sum += l.size();
            record.add(l);
        }
        for (int j = 1; j < matrix.length; j++) {
            int row = j;
            int col = matrix[0].length - 1;
            ArrayList<Integer> l = new ArrayList<>();
            l.add(matrix[row][col]);
            while ((++row) < matrix.length && (--col) >= 0) {
                l.add(matrix[row][col]);
            }
            sum += l.size();
            record.add(l);
        }
        int[] res = new int[sum];
        boolean f = false;
        int cur = 0;
        for (int i = 0; i < record.size(); i++) {
            ArrayList<Integer> ele = record.get(i);
            if (f) {
                for (int j = 0; j < ele.size();) {
                    res[cur++] = ele.get(j++);
                }
                f = false;
            } else if (!f) {
                for (int j = ele.size() - 1; j >= 0;) {
                    res[cur++] = ele.get(j--);
                }
                f = true;
            }
        }
        return res;
    }
}
