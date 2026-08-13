class Solution {
    public int minimumPushes(String word) {
        int l=word.length();
        if(l<=8)
        return l;
        else
        {
            int x=0;
            int i=1;
            while(l>8)
            {
                x+=8*i;
                i++;
                l-=8;
            }
            x+=i*l;
            return x;
        }
        
    }
}