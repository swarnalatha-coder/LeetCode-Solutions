class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> res=new ArrayList<>();
       int n=matrix.length;
       int m=matrix[0].length;
       int top=0,bot=n-1,left=0,right=m-1;
       while(top<=bot && left<=right){
        for(int i=left;i<=right;i++){
            res.add(matrix[top][i]);

        }
        top++;
        for(int i=top;i<=bot;i++){
            res.add(matrix[i][right]);
           
        }
        right--;
        if(top<=bot){
            for(int i=right;i>=left;i--){
                res.add(matrix[bot][i]);
            }
        }
        bot--;
        if(left<=right){
            for(int i=bot;i>=top;i--){
                res.add(matrix[i][left]);
            }
        }
        left++;
       }
       return res;
    }
}