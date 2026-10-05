class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map= new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int req=target-x;
            if(map.containsKey(req))
                {
                    res[0]=i;
                    res[1]=map.get(req);
                    return res;
                }
            else 
                map.put(x,i);
        }
        return res;
    }
}