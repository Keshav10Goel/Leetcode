class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==')' &&c==0)
            c1++;

            else if(ch=='(')
                c++;
            else if(ch==')')
                c--;
        }
        return Math.abs(Math.abs(c)+c1);
    }
}