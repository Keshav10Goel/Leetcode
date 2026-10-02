class Solution {
    public double myPow(double x, long n) {
        if (x==1)
        return 1.0;
        if(x==0)
        return 0.0;
        if(n==0)
        return 1.0;
        long bin=n;
        if(x==-1 && n%2==0)
        return 1.0;
        else if(x==-1 &&n%2==1)
        return -1.0;

        if(bin<0)
        {
            bin=-bin;
        }
        
        double ans=1;
        while(bin>0)
        {
            if(bin%2==1)
            ans*=x;
            x=x*x;
            bin=bin/2;
        }
        if(n<0)
        return 1.0/ans;
        return ans;
    }
}