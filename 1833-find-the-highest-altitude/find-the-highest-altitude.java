class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(gain[0]-0);
        int n=gain.length;
        for(int i=1;i<n;i++){
            int tempo=gain[i]+ans.get(i);
            ans.add(tempo);
        }
        System.out.println(ans);
        return Collections.max(ans);
    }
}