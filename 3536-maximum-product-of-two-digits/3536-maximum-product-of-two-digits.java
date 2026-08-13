class Solution {
    public int maxProduct(int n) {
        if(n<=99)
        return ((n%10)*(n/10));
        else
        {
            int x=n;
            int m=0,sm=0 ;
            int l=0;
            while(x>0)
                {
                    l=x%10;
                    if(l>m)
                    {
                        sm=m;
                        m=l;
                    }
                    else if(l>sm)
                    sm=l;


                    x=x/10;
                    
                }
          
            
            return sm*m;
        }
        
    }
}