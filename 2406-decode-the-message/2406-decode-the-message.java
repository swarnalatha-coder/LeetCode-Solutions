class Solution {
    public String decodeMessage(String key, String message) {
       Map<Character,Character> dict = new HashMap<>();
       char currCh='a';
       for(char ch:key.toCharArray()){
        if(Character.isLetter(ch) && !dict.containsKey(ch)){
            dict.put(ch,currCh);
            currCh++;
        }
       }
       dict.put(' ', ' ');
       String res="";

       for(char c: message.toCharArray()){
        res+=dict.get(c);
       }
       return res;
    }
}