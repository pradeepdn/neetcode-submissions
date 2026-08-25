class Solution {
    public String minWindow(String s, String t) {
        int[] tt = new int[128];
        int need = 0;
        for (int i = 0; i < t.length(); i++) {
            tt[t.charAt(i)]++;
            if (tt[t.charAt(i)] == 1) {
                need++;
            }
        }

        int have = 0;
        int left = 0;
        int right = 0;
        String shortString = "";
        int[] ss = new int[128];
        while (right < s.length()) {
            char c = s.charAt(right);
            ss[c]++;
            if (ss[c] == tt[c]) {
                have++;
            }
            while (have == need) {
                if (shortString.equals("") || right - left + 1 < shortString.length()) {
                    shortString = s.substring(left, right + 1);
                }
                char lc = s.charAt(left);
                ss[lc]--;

                if (ss[lc] < tt[lc]) {
                    have--;
                }
                left++;
            }
            right++;
        }
        return shortString;
    }
}
