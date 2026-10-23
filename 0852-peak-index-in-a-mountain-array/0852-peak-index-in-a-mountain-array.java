class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int h=arr.length-1;
        int m=0;
        while(l<h)
        {
            m=(l+h)/2;
            if(arr[m]>arr[m+1] && arr[m]>arr[m-1])
            return m;
            if(arr[m]>arr[m+1])
            h=m;
            else if(arr[m]<arr[m+1])
            l=m;

        }
        return -1;
    }
}