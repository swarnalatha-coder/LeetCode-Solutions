class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            if(isRotate(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isRotate(int n){
        boolean res=false;
        
        while(n>0){
           int d=n%10;
            if(d==3 || d==4 || d==7)
                return false;
            if(d==2 || d==5 || d==6 || d==9)
               res=true;
               n=n/10;
        }
        return res;
    }
}