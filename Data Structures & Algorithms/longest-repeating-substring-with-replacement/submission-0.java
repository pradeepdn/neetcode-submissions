class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> str = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLen = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            str.put(c, str.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, str.get(c));
            while(((right - left + 1) - maxFreq) > k){
                char lc = s.charAt(left);
                str.put(lc ,str.get(lc) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
    return maxLen;    
    }
}
