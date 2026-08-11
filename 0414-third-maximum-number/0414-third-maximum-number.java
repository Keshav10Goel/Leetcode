class Solution {
    public int thirdMax(int[] nums) {
        long l=nums[0],sl=Long.MIN_VALUE, tl=Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>l)
            {
                tl=sl;
                sl=l;
                l=nums[i];        
            }
            else if(nums[i]>sl && nums[i]!= l)
            {
                tl=sl;
                sl=nums[i];
            }
            else if(nums[i]>tl && nums[i]!=l && nums[i]!=sl)
            {
                tl=nums[i];
            }        
        }

        return (tl>Long.MIN_VALUE)?(int)tl:(int)l;
    }
}