class Solution {
    public int addDigits(int num) {
        while(num>9){
           int result=0;
           while(num>0){
                int d=num%10;
                result=result+d;
                 num=num/10;
           }
           num=result;
        }
        return num;
    }
}