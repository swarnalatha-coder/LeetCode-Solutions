class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++){
          res=countandadd(res);
        }
        return res;
    }
    String countandadd(String s){
      StringBuilder res=new StringBuilder();
      int count=1;
      char c=s.charAt(0);
      for(int i=1;i<s.length();i++){
        if(s.charAt(i)==c) count++;
        else{
          res.append(count);
          res.append(c);
          c=s.charAt(i);
          count=1;
        }

      }
      res.append(count);
      res.append(c);
      return res.toString();
    }
}