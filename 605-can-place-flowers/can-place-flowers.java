class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int count=0;
        int i=0;
        while(i<arr.length){
            if(arr[i] == 0 &&
                (i == 0 || arr[i - 1] == 0) &&
                (i == arr.length - 1 || arr[i + 1] == 0)){
                count++;
                arr[i] = 1;
                i+=2;
            }
            else{i++;}
        }
        System.out.println(count);
      return count>=n;
    } 
}