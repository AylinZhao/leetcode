class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return ""; 
        int n = strs[0].length();
        char[] refer = new char[n];
        for (int i = 0; i < n; i++) {
            refer[i] = strs[0].charAt(i);            
        }
        String res = "";
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != refer[i]) {
                    flag = false;
                    break;    
                } 
            }
            // System.out.println(refer[i]);
            if (flag) res += refer[i];
            if (!flag) break;
        }
        return res;

    }
}   
