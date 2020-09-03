class Solution {
    public String fractionAddition(String expression) {
    	if (expression.equals("")) return expression;
    	if (expression.charAt(0) != '-') expression = "+" + expression;
    	ArrayList<String> plus = new ArrayList<>();
    	ArrayList<String> subs = new ArrayList<>();
    	String[] strs = expression.split("-");
		for (String str : strs) {
			String[] nums = str.split("\\+");
            if (!nums[0].equals("")) {
                subs.add(nums[0]);
    			// System.out.println("subs: " + nums[0]);
            } 
			for (int i = 1; i < nums.length; i++) {
                if (!nums[i].equals("")){
                    plus.add(nums[i]);
					// System.out.println("plus: " + nums[i]);
                } 
			}
		}
		String l = callist(plus);
		String r = callist(subs);
        // System.out.print("l: " + l + "r:" + r);
        return cal(l, r, "-");
    }

    public String callist(ArrayList<String> list) {
    	if (list.size() == 0) return "";
    	String s = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			s = cal(s, list.get(i), "+");
		}
		return s;
    }
    public String cal(String a, String b, String suffix) {
    	if (b.equals("")) return a;
    	if (a.equals("")) return suffix.equals("+") ? b : ("-" + b);
		int n1 = Integer.parseInt(a.split("\\/")[0]);
		int d1 = Integer.parseInt(a.split("\\/")[1]);
		// System.out.println(" fraction : " + n1 + "/" + d1);
	 	
		int n2 = Integer.parseInt(b.split("\\/")[0]);
		int d2 = Integer.parseInt(b.split("\\/")[1]);
		// System.out.println(" fraction : " + n2 + "/" + d2);
	 	
		int d = d1 * d2;
		int n = 0;
		if (suffix == "-") n = (n1 * d2 - n2 * d1); 
		else n = (n1 * d2 + n2 * d1);
		int gcd = getGCD(d, Math.abs(n));
		int p = Math.abs(n) / gcd;
		int q = d / gcd;
		// System.out.println(" fraction : " + p + "/" + q);
		return n < 0 ? ("-" + p + "/" + q) : (p + "/" + q);
    }
    public int getGCD(int a, int b) {
	    if (a < 0 || b < 0) {
	        return -1; // 数学上不考虑负数的约数
	    }
	    if (b == 0) {
	        return a;
	    }
	    while (a % b != 0) {
	        int temp = a % b;
	        a = b;
	        b = temp;
	    }
	    return b;
	}
}