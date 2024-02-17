class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
for(int i=0;i+1<heights.length;i++){
    int d=heights[i+1]-heights[i];
    if(d>0){
        bricks-=d;
        pq.add(d);
    }
    if(bricks<0){
        bricks+=pq.poll();
        if (ladders > 0) ladders--;
			else return i;
    }
    
}
        return heights.length-1;
    }
}