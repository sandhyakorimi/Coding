public class ProductOfArray_exceptIt {
    public int[] ProductOfArray(int[] nums){
        int n = nums.length;
        int res[] = new int[n];
        int pref[] = new int[n];
        pref[0]=1;
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1]*nums[i];
        }
        int suff[] = new int[n];
        suff[n-1]=1;
        for(int i=n-2; i>=0; i--){
            suff[i] = suff[i+1]*nums[i+1];
        }

        for(int i=0; i<n; i++){
            res[i] = pref[i]*suff[i];
        }   
        return res; 
    }
}
