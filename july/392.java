class Solution {
    public boolean isSubsequence(String s, String t) {
    	int p = 0;
    	int q = 0;
    	for (int i = p; i < s.length(); i++) {
    		char one = s.charAt(i);
    		boolean flag = false;
	    	for (int j = q; j < t.length(); j++) {
				if (t.charAt(j) == one && j >= i) {
					q = j + 1;	
					flag = true;
					break;	
				} 
    		}
    		if (!flag) return flag;
    	}
    	return true;
	}    	
}

// class Solution {
//     public HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//     public boolean isSubsequence(String s, String t) {
//     	// HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//     	for (int i = 0; i < t.length(); i++) {
//     		if (!map.containsKey(t.charAt(i))) map.put(t.charAt(i), i);
//     	}
//     	int previous = -1;
//     	for (int j = 0; j < s.length(); j++) {
//     		char c = s.charAt(j);
//     		if (map.containsKey(c) && previous < map.get(c)) {
//     			previous = map.get(c);
//     			continue;
//     		} else return false;
            
//     	}
//     	return true;
//     }
// }