class Solution {
    public char repeatedCharacter(String s) {
        int freq[]= new int[256];
        for(int i=0;i<s.length();i++)
            {
                char ch= s.charAt(i);
                freq[ch]++;
                if(freq[ch]==2)
                return ch;
            }
        
        return ' ';
    }
}