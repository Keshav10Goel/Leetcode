class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=s;

        StringBuilder str= new StringBuilder();
        int f=0;
        for(int i=0;i<=s.length();i++)
        {
            if(i==s.length()||s.charAt(i)==' ')
            {
                if(f<i)
                {
                    str.append(rev(s.substring(f,i)));
                    str.append(" ");
                }
                f=i+1;
            }
        }
        str.reverse();
        
        return str.toString().trim();
        
    }
    public static String rev(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}