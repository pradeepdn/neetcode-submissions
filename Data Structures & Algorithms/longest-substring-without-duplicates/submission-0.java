class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> str = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            if (str.containsKey(c)) {
                left = Math.max(left, str.get(c) + 1);
                ;
            }
            str.put(c, right);
            int curLen = right - left + 1;
            maxLen = Math.max(maxLen, curLen);

            right++;
        }
        return maxLen;
    }
}
