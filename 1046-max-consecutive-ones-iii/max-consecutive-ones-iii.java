class Solution {
    public int longestOnes(int[] nums, int k) {
    int ans=0;
    for(int l=0;l<nums.length;l++){
        int r=l;
        int currans=0;
        int count=0;
        while(count<=k&&r<nums.length){
            if(nums[r]==0){
                count++;
            }
            r++;
            if(count<=k){
            currans++;
            }
            
        }
        ans=Math.max(currans,ans);
    }
        return ans;
    }
}