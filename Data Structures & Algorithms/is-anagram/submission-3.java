class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> a = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            a.put(ch, a.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if ((a.containsKey(ch))) {
                if (a.get(ch) == 1) {
                    a.remove(ch);
                }
                else if (a.get(ch) > 1) {
                    a.put(ch, a.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return a.isEmpty();
    }
}
