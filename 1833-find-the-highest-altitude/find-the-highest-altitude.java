class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int fans=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            int tempo=gain[i]+ans.get(i);
            ans.add(tempo);
            fans=Math.max(fans,tempo);
        }
        System.out.println(ans);
        return fans;
    }
}