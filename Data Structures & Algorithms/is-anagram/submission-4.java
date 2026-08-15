// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         Map<Character, Integer> a = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             a.put(ch, a.getOrDefault(ch, 0) + 1);
//         }
//         for (int i = 0; i < t.length(); i++) {
//             char ch = t.charAt(i);
//             if ((a.containsKey(ch))) {
//                 if (a.get(ch) == 1) {
//                     a.remove(ch);
//                 }
//                 else if (a.get(ch) > 1) {
//                     a.put(ch, a.get(ch) - 1);
//                 }
//             } else {
//                 return false;
//             }
//         }
//         return a.isEmpty();
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        // Quick exit if lengths don't match
        if (s.length() != t.length()) {
            return false;
        }

        // An array of size 26 to track frequencies of 'a' through 'z'
        int[] charCounts = new int[26];

        // Process both strings in a single loop
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++; // Increment for string s
            charCounts[t.charAt(i) - 'a']--; // Decrement for string t
        }

        // If it's an anagram, every single position must be exactly 0
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

