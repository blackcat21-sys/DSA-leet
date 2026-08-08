class Solution {
    public int reverse(int x) {
        int ans;
        if(x<0){
            ans=reverseit(Math.abs(x));
            ans=-ans;
        }
        else{
            ans=reverseit(x);
        }
        return ans;
    }
    public int reverseit(int x){
        long ans=0;
        while (x > 0) {
            int temp = x % 10;
            ans = ans * 10 + temp;
            x = x / 10;
        }
        if (ans > Integer.MAX_VALUE|| ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ans;
    }
}