class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] ss1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ss1[s1.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = s1.length() - 1;
        int[] ss2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ss2[s2.charAt(i) - 'a']++;
        }
        while (right < s2.length()) {
            if (Arrays.equals(ss1, ss2)) {
                return true;
            } else {
                ss2[s2.charAt(left) - 'a']--;
                left++;
                right++;
                if (right < s2.length()) {
                    ss2[s2.charAt(right) - 'a']++;
                }
            }
        }
        return false;
    }
}
