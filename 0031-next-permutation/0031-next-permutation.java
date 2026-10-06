class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
            piv=i;
            break;
            }
        }
        if(piv==-1)
        {
        Arrays.sort(nums);
        return;
        }
        for(int i=nums.length-1;i>piv;i--)
        {
            if(nums[i]>nums[piv])
            {
                int t=nums[i];
                nums[i]=nums[piv];
                nums[piv]=t;
                break;
            }
        }
        int i=piv+1;
        int j=nums.length-1;
        while(i<j)
        {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }

        

        
    }
}