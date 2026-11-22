class Solution {
    public boolean checkString(String s) {
        int f=0;
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch=='b')
            f=1;
            if(f==1 && ch=='a')
            return false;
        }
        return true;
    }
}