class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // sort by earliest meeting
        Arrays.sort(meetings, (a,b) -> (a[0] - b[0]));

        PriorityQueue<Integer> availableRoom = new PriorityQueue();

        // <end time, room occupied> 
        PriorityQueue<int[]> runningMeeting = new PriorityQueue<int[]>(
            (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        // track most used room
        int[] count = new int[n];

        int result = 0;

        // init
        for (int i=0;i<n;i++) {
            availableRoom.offer(i);
        }

        for (int[] next : meetings) {
            // check if any room will become available before schedule next meeting
            while (!runningMeeting.isEmpty() && runningMeeting.peek()[0] <= next[0]) {
                availableRoom.offer(runningMeeting.poll()[1]);
            }

            // if room is available, then start will be right on time which is next[0]
            int delayed = next[0];

            // check if any room is currently available
            if (availableRoom.isEmpty()) {
                // if not available, then need to wait for a meeting to complete
                int[] endedMeeting = runningMeeting.poll();
                // delayed to when this meeting ends
                delayed = endedMeeting[0];
                // update room availability
                availableRoom.offer(endedMeeting[1]);
            }

            // now time to schedule next meeting as there is room available
            int room = availableRoom.poll();
            count[room] ++;

            // update tracked most used room number
            // tip: use smaller room if count is the same!
            if (count[room] > count[result]) {
                result = room;
            } else if (count[room] == count[result]) {
                result = Math.min(result, room);
            }

            // meeting is delayed, update the end time
            runningMeeting.offer(new int[] {delayed + (next[1]-next[0]), room});
        }

        return result;
    }
}