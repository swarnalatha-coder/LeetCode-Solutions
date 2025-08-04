class Solution {
    public int[][] generateMatrix(int n) {
       int[][] res =new int[n][n];
       int left=0,right=n-1,top=0,bot=n-1,c=1;
       while(c<=n*n){
        for(int i=left;i<=right;i++){
            res[top][i]=c++;
            
        }
        top++;
        for (int i = top; i <= bot; i++) {
            res[i][right]=c++;
            
        }
        right--;
        if (top <= bot) {
            for (int i = right; i >= left; i--) {
                res[bot][i]=c++;
                
            }
        }
        bot--;
        if (left <= right) {
            for (int i = bot; i >= top; i--) {
                res[i][left]=c++;
                
            }
        }
        left++;
        }
        return res;
        
    } 
    
}