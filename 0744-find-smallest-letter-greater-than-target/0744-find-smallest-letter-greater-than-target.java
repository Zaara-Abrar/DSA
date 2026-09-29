class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int mid, first=0, last=letters.length-1;
            while(first<=last) {
                mid=(first+last)/2;
                // if(arr[mid]==value) {
                //     return mid;
                // }
                if(target<letters[mid]) {
                    last=mid-1;
                }
                else {
                    first=mid+1;
                }
            }
//            for (int j : arr) {
//                if (j > value) return j;
//            }
//            return -1;
            return letters[first%letters.length];
    }
}