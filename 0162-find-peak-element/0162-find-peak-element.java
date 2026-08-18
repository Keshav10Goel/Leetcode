class Solution {
    public int findPeakElement(int[] arr) {
        int l=0,h=arr.length;
        
        while(l<=h)
        {
            int mid=(l+h)/2;
            if((mid==0 || arr[mid]>=arr[mid-1])&& (mid==arr.length-1 || arr[mid]>=arr[mid+1]))
            return mid;
            if(mid>0 && arr[mid-1]>=arr[mid])
            h=mid-1;
            else
            l=mid+1;
        }
        return -1;

    }
}