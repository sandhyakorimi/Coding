package TwoPointers;

public class MergeSortedArray {
    public void MergeSortedArrays(int[] str1, int m, int[] str2, int n){
        int l=m+n-1;
        int i=m-1,j=n-1;
        while(j>=0){
            if(i>=0 && str1[i]>=str2[j]){
                str1[l--] = str1[i--];
            }else{
                str1[l--] = str2[j--];
            }
        }
    }
}
// This code merges two sorted arrays by using three pointers from the end. We compare the elements from the
//  back of both arrays and place the larger one in the correct position of nums1. This ensures that all elements
//   are merged in sorted order without overwriting existing values. The algorithm works in O(m + n) time and uses
//    O(1) extra space because the merging is done in-place.