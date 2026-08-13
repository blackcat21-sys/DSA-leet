class Solution {
    public boolean isPalindrome(String s) {
        String trim=s.trim();
        String result=trim.replaceAll("[^A-Za-z0-9]","");
        result=result.toLowerCase();
        int i=0;
        int j=result.length()-1;
        if(result.length()==0){
            return true;
        }
        while(i<=j){
            if(result.charAt(i)!=result.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}