class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int i = 1; i < n; i++) {

            int len = s.length();
            StringBuilder next = new StringBuilder(len * 2);

            for (int j = 0; j < len; ) {

                char ch = s.charAt(j);
                int count = 1;

                while (j + count < len && s.charAt(j + count) == ch) {
                    count++;
                }

                next.append(count).append(ch);
                j += count;
            }

            s = next.toString();
        }

        return s;
    }
}