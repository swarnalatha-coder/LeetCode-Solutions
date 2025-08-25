class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(char s : columnTitle.toCharArray()){
          res=res*26+(s-'A'+1);
        }
        return res;
    }
}