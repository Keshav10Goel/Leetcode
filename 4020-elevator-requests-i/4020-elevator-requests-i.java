import java.util.*;
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=0;
        int x=0;
        for(int i=0;i<requests.length;i++)
            {
                t+=Math.abs(x-requests[i]);
                x=requests[i];
            }
        
        return t;
    }
}