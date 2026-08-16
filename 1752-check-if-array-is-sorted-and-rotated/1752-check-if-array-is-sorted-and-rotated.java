class Solution {
    public boolean check(int[] nums) {
        int k=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {k=i; break;}
        }
        if(k==-1)
        return true;
        rev(nums, 0,k);
        rev(nums,k+1,nums.length-1);
        rev(nums,0,nums.length-1);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
    public void rev(int ar[], int str, int end)
    {
        int temp;
        while(str<end)
        {
            temp=ar[str];
            ar[str]=ar[end];
            ar[end]=temp;
            str++;
            end--;
        }
    }

}