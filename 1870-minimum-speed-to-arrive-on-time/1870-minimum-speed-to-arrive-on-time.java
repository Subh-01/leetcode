class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
          int l=1,h=100000000;
        while(l<=h){
            int m=l+(h-l)/2;
            if(check(dist,hour,m))
                h=m-1;
            else l=m+1;
        }
        return l<=100000000?l:-1;
    }
    public boolean check(int[] dist, double hour,int speed){
        double ans = 0;
        for(int i=0;i<dist.length;i++){
            double time = dist[i]*1.0/speed;
            if(i!=dist.length-1)ans = ans + Math.ceil(time);
            else ans += time;
            if(ans>hour) return false;
        }
        return ans<=hour;
    }
}