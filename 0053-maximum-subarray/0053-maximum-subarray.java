class Solution {
    public int maxSubArray(int[] nums) {
        int mx=nums[0];
        int sum=0;
        for(int n:nums){
            sum=sum+n;
            mx=Math.max(mx,sum);
            if(sum<0){
                sum=0;
            }
        
        }
        return mx;
    }
}