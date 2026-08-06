class Solution {
    public int smallestNumber(int n, int t) {
        int ans=-1;
        for(int j=n;j<=100;j++){
            int mul=1;
            int temp2=j;
            while(temp2>0){
                int temp=temp2%10;
                mul*=temp;
                temp2=temp2/10;
            }
            if(mul%t==0){
                ans=j;
                break;
            }
        }
        return ans;
    }
}