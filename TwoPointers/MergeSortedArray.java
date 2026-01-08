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
