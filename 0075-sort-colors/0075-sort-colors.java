class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        for(int p=0;p<=2;p++){
            for(int j=i;j<nums.length;j++){
            if(nums[j]==p){
                nums[j]=nums[i];
                nums[i++]=p;
            }
        }
    }
}
}