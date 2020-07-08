class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (!map.containsKey(t.charAt(j))|| map.get(t.charAt(j)) == 0) {
                return t.charAt(j);   
            }
            map.put(t.charAt(j), map.get(t.charAt(j)) - 1);   
        }
        return 'a';
    }
}
