class Solution {
    static int len;
    int res = 0;
    public int countArrangement(int N) {
        len = N;//len为全局变量，方便调用；
        boolean[] state = new boolean[len + 1];//state表示使用情况；初始为false，表示未被使用；
        state[0] = true;//坐标一致
        int sum = 0;
        dfs(state, sum, 1);//dfs的作用是遍历，遍历state中未被使用的数字，然后利用起来；
        return res;
    }
    public void dfs(boolean[] state, int sum, int cur) {
        if (sum == len) {
            // System.out.println("here");
            res++; //表示一种完美排列的情况
            return; 
        }
        for (int i = 1; i <= len; i++) {
            if (state[i] == false && (i % cur == 0 || cur % i == 0)) {
                state[i] = true;//占用数字i；i不可能为0；
                sum++;
                dfs(state, sum, cur + 1);
                sum--;
                state[i] = false;
            }
        }
        return;
    }
}
