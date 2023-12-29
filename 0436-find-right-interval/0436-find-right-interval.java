class Solution {
    public int[] findRightInterval(int[][] intervals) {
         List<Integer> list = new ArrayList<>();
        int val;
        int indx=0;
        for (int i = 0; i < intervals.length; i++) {
            val = Integer.MAX_VALUE;
            indx=-1;
            for (int j = 0; j <intervals.length; j++) {
                if(intervals[j][0]>=intervals[i][1]&&intervals[j][0]<val){
                    val=intervals[j][0];
                    indx=j;
                    System.out.println(indx);
                }
            }
            list.add(indx);
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}