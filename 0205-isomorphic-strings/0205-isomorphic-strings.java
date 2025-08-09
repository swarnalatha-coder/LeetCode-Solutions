class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> dict = new HashMap<>();
        Map<Character, Character> dict1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
          char c1 = s.charAt(i);
          char c2 = t.charAt(i);

          if (dict.containsKey(c1)) {
                                                                                                     if (dict.get(c1) != c2) return false;
                                                                                                   } else {
                                                                                                       dict.put(c1, c2);
                                                                                                   }

                                                                                                   if (dict1.containsKey(c2)) {
                                                                                                     if (dict1.get(c2) != c1) return false;
                                                                                                   } else {
                                                                                                                                                                                            dict1.put(c2, c1);
                                                                                                   }
        }
        return true;
    }
}