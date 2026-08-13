class Solution {
    public int[] plusOne(int[] digits) {

        int l = digits.length;

        
        if (digits[l-1]<9) {
            digits[l-1]++;
            return digits;
        }

      
        int c=1;

        for (int i=l-1;i>=0;i--) {

            int sum = digits[i]+c;

            digits[i] =sum%10;
            c =sum/10;

            if (c==0)
                return digits;
        }

        int[] a =new int[l + 1];
        a[0] =1;

        return a;
    }
}