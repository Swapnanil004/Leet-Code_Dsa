class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> Array=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(Array.isEmpty()|| intervals[i][0]> Array.get(Array.size()-1)[1]){
                Array.add(intervals[i]);
            }
            else{
                Array.get(Array.size()-1)[1]=Math.max(Array.get(Array.size()-1)[1],intervals[i][1]);
            }

        }
             return Array.toArray(new int[Array.size()][]);




        
    }
}