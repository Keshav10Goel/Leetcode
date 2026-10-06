class Solution {
    public int maxArea(int[] height) {
        int x=0, y=height.length-1;
        int max=0;
        int cur=0;
        while(x<y)
        {
            cur=Math.min(height[x],height[y]) *(y-x);
            max=Math.max(cur, max);
            if(height[x]<height[y])
            x++;
            else
            y--;
        }
        return max;
    }

}