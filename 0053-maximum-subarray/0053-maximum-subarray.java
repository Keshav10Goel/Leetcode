class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0],s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=(nums[i]>(s+nums[i]))?nums[i]:(s+nums[i]);
            maxi=(s>maxi)?s:maxi;
        }
        return maxi;
    }
}