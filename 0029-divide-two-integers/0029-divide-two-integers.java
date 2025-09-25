class Solution {
  public int divide(int dividend, int divisor) {
      
      if(dividend == Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
      if(dividend==divisor)
             return 1;
      boolean sign = (dividend>0) ^ (divisor>0);
      long divid=Math.abs((long)dividend);
      long divis=Math.abs((long)divisor);
      long res=0;
      while(divis<=divid){
        int p=0;
        while(divid>=divis <<(p+1))// d*)1<<(p+1)
          p++;
        res+=1<<p;
        divid-=divis<<p;
      }
      return sign?-(int)res:(int)res;
    }
}