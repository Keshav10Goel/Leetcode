class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list= new ArrayList<>();
        if(arr.length==2)
        {
            List<Integer> l= new ArrayList<>();
            l.add(arr[0]);
            l.add(arr[1]);
            list.add(l);
            return list;
        }
        long diff=Long.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            diff=(diff<(arr[i+1]-arr[i]))?diff:(arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
            List<Integer> l= new ArrayList<>();
            if(arr[i+1]-arr[i]== diff)
                {
                    l.add(arr[i]);
                    l.add(arr[i+1]);
                }
            if(!l.isEmpty())
            list.add(l);
        }
        return list;
    }
}