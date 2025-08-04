class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;
        int res[] = new int[n];
        for(int a : nums){
            if(a>=0){
                res[even] = a;
                even+=2;
                                                                                                  }
                                                                                                  else{
                                                                                                      res[odd] = a;
                                                                                                      odd+=2;
                                                                                                  }
                                                                                              }
                                                                                              return res;
    }
}