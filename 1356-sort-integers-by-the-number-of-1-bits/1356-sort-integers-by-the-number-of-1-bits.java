class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, (a, b) -> {
            int p = numberOf1s(a);
            int q = numberOf1s(b);
            if (p == q) {
                return a - b;
            } else {
                return p - q;
            }
        });
        return Arrays.stream(intArr).mapToInt(Integer::intValue).toArray();
    }
     private int numberOf1s(int a) {
        int count = 0;
        while (a > 0) {
            a &= (a - 1);
            count++;
        }
        return count;
    }
}
/*
======another method===========

for(int i=0;i<arr.length;i++){
arr[i]=Integer.bitCount(arr[i])*10001  //To prevent conflicts, place the new number outside its given                                           //constraints when adding it to the array.
}
Arrays.sort(arr);

for(int i=0;i<arr.length)
arr[i]=arr[i]%10001;

return arr;
    */
    