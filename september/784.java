class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<String>();
        String s = "";
        search(S, s, 0, list);                       
        return list;
    }
    public void search(String S, String s, int p, List<String> list) {
        if (p >= S.length()) {
            // System.out.println(s);
            list.add(s);
            return;
        }
        for (int i = p; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                s = s + c;
                if (i == S.length() - 1) {
                    // String s3 = s;
                    list.add(s);   
                }
                // System.out.println(s);
                continue;  
            }   
            String s1 = "";
            s1 = s + c;
            search(S, s1, i + 1, list);
            String s2 = "";
            s2 = s + change(c);
            search(S, s2, i + 1, list);
            break;
        }
        return;
    }
    public char change(char c) {
        if (c >= 'a' && c <= 'z') {
            c -= 32;
        } else if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }
}
