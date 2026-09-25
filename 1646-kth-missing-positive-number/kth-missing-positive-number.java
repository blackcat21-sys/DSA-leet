
class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> ansl = new ArrayList<>();

        for (int i = 1; i <= 2000; i++) {
            ansl.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            ansl.remove(Integer.valueOf(arr[i]));
        }

        return ansl.get(k - 1);
    }
}