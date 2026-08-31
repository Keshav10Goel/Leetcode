class Solution {
    public String countAndSay(int n) {
        
        if (n == 1) return "1";

        String s = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder t = new StringBuilder();

            int count = 1;

            for (int j = 1; j <= s.length(); j++) {

                if (j < s.length() && s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } 
                else {
                    t.append(count);
                    t.append(s.charAt(j - 1));
                    count = 1;
                }
            }

            s = t.toString();
        }

        return s;
    }
}