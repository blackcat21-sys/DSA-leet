class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        int idx=0;
        int currgas=0;
        for(int i=0;i<cost.length;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                idx=i+1;
                currgas=0;
            }
        }
        return idx;
    }
}