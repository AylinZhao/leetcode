class Solution {
    public boolean canWinNim(int n) {
        if (n == 0)return false;
        if (n <= 3) return true;
        if (n % 4 == 0) return false;
        return true;
    	// // boolean[] f = new boolean[n + 1];
    	// boolean f1 = true;
    	// boolean f2 = true;
    	// boolean f3 = true;
    	// boolean f = false;
    	// for (int i = 4; i <= n; i++) {
    	// 	f = !(f1 && f2 && f3);
        //     System.out.println(f);
        //     // System.out.println("current three : " + f1 + " " + f2 + " " + f3);
        //     // System.out.println("i : " + i + " state : " + f + "check : " + (f1 && f2 && f3));
    	// 	f3 = f2;
        //     f2 = f1;
        //     f1 = f;
    	// }
    	// return f;
    }
}