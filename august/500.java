class Solution {
    public String[] findWords(String[] words) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] r1 = {'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'};
	    char[] r2 = {'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'};
	    char[] r3 = {'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};
        init(r1, map, 1);
		init(r2, map, 2);
		init(r3, map, 3);
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			int k = map.get(s.charAt(0));
			boolean f = true;
			for (int j = 0; j < s.length(); j++) {
                // System.out.println(s.charAt(j));
				if (map.get(s.charAt(j)) != k) {
					f = false;
					break;
				} else continue;
			}
			if (f) res.add(s);
		}
        // System.out.println("res " + res.size());
        String[] ret = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ret[i] = res.get(i);
        }
		return ret;
    }
    public void init(char[] r, HashMap<Character, Integer> map, int key) {
    	for (int i = 0; i < r.length; i++) {
            // System.out.print(" key : " + r[i] + " value :" + key);
    		map.put(r[i], key);
    	}
    }

}