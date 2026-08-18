class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ana = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] freq = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                freq[strs[i].charAt(j) - 'a']++;
            }
            String anag = Arrays.toString(freq);
            ana.putIfAbsent(anag, new ArrayList<>());
            ana.get(anag).add(strs[i]);
        }
        return new ArrayList<>(ana.values());
    }
}
