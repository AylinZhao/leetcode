class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    	double[] edge = new double[6];
    	edge[0] = checklen(p1, p2);
    	edge[1] = checklen(p1, p3);
    	edge[2] = checklen(p1, p4);
    	edge[3] = checklen(p2, p3);
    	edge[4] = checklen(p2, p4);
    	edge[5] = checklen(p3, p4);
    	if (edge[0] + edge[1] + edge[2] + edge[3] + edge[4] + edge[5] == 0) return false;
    	Arrays.sort(edge);
    	if (edge[0] == edge[1] && edge[1] == edge[2] && edge[2] == edge[3] && edge[4] == edge[5] && edge[4] == (2 * edge[0])) {
    		return true;
    	}
    	return false;

    }
    public double checklen(int[] p1, int[] p2) {
    	double d = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    	return d;
    }
}