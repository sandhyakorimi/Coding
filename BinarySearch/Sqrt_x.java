public class Sqrt_x {
    public int Square_x(int x){
        int l=0, r=x, res=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if((long)m*m>x){
                r=m-1;
            }else if((long)m*m<x){
                l=m+1;
                res=m;
            }else{
                return m;
            }
        }
        return res;
    }   
} 
// "I used binary search between 0 and x. I check the middle m: if m*m equals x I return it, if m*m is less I move right
//  and save m as a possible answer, if more I move left. I cast to long to avoid overflow. At the end, I return the floor
//   value stored in res." 