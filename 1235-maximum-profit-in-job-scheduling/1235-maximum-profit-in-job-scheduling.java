class Solution {
     public class Job{
         int endTime;
        int startTime;
        int profit;
        public Job(int endTime, int startTime, int profit){
            this.endTime=endTime;
            this.startTime=startTime;
            this.profit=profit;
        }
     }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=profit.length;
        Job jobs[]=new Job[n];
        
        for(int i=0;i<n;i++)
            jobs[i]=new Job(endTime[i] ,startTime[i] ,profit[i]);
        
        Arrays.sort(jobs, Comparator.comparingInt(a->a.endTime));
         int[] dp = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            int endTimeValue = jobs[i].endTime;
            int startTimeValue = jobs[i].startTime;
            int profitValue = jobs[i].profit;
            int latestNonConflictJobIndex = upperBound(jobs, i, startTimeValue);
            dp[i + 1] = Math.max(dp[i], dp[latestNonConflictJobIndex] + profitValue);

        }
        return dp[n];
    }
   
    public int upperBound(Job[] jobs, int endIndex, int targetTime){
        int l=0,r=endIndex;
        
        while(l<r){
            int m=(l+r)/2;
            if(jobs[m].endTime <= targetTime)
                l=m+1;
            else r=m;
        }
        return l;
        }
}
