class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0 || s.equals(" ")) return 0;
        int len = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && flag == false) continue; 
            if (s.charAt(i) == ' ' && flag == true) break;
            if (s.charAt(i) != ' ') {
                flag = true;
                len++;
            }
        }
        return len;
    }
}
