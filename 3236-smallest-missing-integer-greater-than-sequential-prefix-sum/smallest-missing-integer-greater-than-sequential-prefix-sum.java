class Solution {
    public int missingInteger(int[] nums) {
      Set<Integer> st=new HashSet<>();
      int msum=nums[0];
      for(int z:nums){
         st.add(z);
      }
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]+1==nums[i]){
            msum+=nums[i];
        }
        else{
            break;
        }
      }  
      while(st.contains(msum)){
        msum++;
      }
      return msum;
    }
}