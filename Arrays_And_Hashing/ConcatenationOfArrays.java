package Arrays_And_Hashing;

public class ConcatenationOfArrays {
    public int[] getConcatinatedArray(int nums[]){
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=ans[i+n]=nums[i];
        }
        return ans;
    }
}
