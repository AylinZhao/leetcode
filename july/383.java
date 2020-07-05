class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	for (int i = 0; i < magazine.length(); i++) {
    		char c = magazine.charAt(i);
    		if (!map.containsKey(c)) {
    			map.put(c, 1);
    		} else {
    			map.put(c, map.get(c) + 1);
    		}
    	}
    	for (int j = 0; j < ransomNote.length(); j++) {
    		char t = ransomNote.charAt(j);
    		if (map.containsKey(t) && map.get(t) > 0) {
    			map.put(t, map.get(t) - 1);
    		} else return false;
    	}
    	return true;
    }
}