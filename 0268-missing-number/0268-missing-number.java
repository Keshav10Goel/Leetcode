class Solution {
    public int missingNumber(int[] arr) {
        // int n= nums.length;
        // int sum= n*(n+1)/2;
        // for(int i=0;i<nums.length;i++)
        // sum-=nums[i];
        // return sum;

        int x=0;
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            c=arr[i]^x;
            if(c!=0)
            return x;
            x++;
        }
        return x;
    }
}