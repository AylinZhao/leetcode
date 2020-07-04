class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int start = 0;
    	int end = matrix[0].length - 1;
        // System.out.println("start : " + start + " end : " + end);
    	for (int i = 0; i < matrix.length; i++) {
    		int[] row = matrix[i];
    		int cur = binaryfind(row, target, start, end);
    		// System.out.println("cur : " + cur);
			if (cur == start - 1) return false;
			if (cur == end + 1) continue;
            // System.out.println("cur : " + cur + "end + 1 =: " + (end + 1));
			if (row[cur] == target) return true;
            end = cur - 1;//更新end;
    	}
        return false;
    }
    public int binaryfind(int[] row, int target, int start, int end) {
    	if (row[start] > target) return start - 1;
    	if (row[end] < target) return end + 1;
    	int low = start;
    	int high = end;
    	while (low < high) {
    		int mid = (low + high) / 2;
    		if (row[mid] == target) {
    			return mid;
    		} else if (row[mid] > target) {
    			high = mid;
    		} else if (row[mid] < target) {
    			low = mid + 1;
    		}
    	}
    	return low;
    }
}