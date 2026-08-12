class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int ans=0;
        int right=-1;
        int left=0;
        for(int i:nums){
            right++;
            hp.put(i,hp.getOrDefault(i,0)+1);
            while(hp.get(i)>k){
                hp.put(nums[left], hp.get(nums[left]) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}