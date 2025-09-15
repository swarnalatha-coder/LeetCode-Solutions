class Solution {
    public int[] canSeePersonsCount(int[] heights) {
       int N =  heights.length;
       int[] stack = new int[N] ;
       int stp = -1;
       stack[++stp] = heights[N-1];
       heights[N-1]=0;
       for(int i=N-2;i>=0;--i){
        int view=0;
        while(stp>=0 && heights[i]>stack[stp]){
          --stp;
          ++view;
        }
        if(stp>=0) ++view;
        stack[++stp] = heights[i];
        heights[i] = view;
       }
       return heights;
    }
}