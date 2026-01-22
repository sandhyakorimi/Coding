public class SearchInsertPosition {
    public int SearchInsertPositionNum(int[] nums, int target){
        int res=nums.length, l=0, r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                res=mid;
                r=mid-1;
            }else{l=mid+1;}
        }
        return res;
    }
}
