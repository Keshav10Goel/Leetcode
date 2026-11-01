class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int n=0;n<nums.length;n++)
        m=Math.min(nums[n],m);
        int moves=0;
        for(int n=0;n<nums.length;n++)
        moves+=nums[n]-m;
        return moves;
    }
}