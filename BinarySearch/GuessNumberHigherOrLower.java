// public class GuessNumberHigherOrLower{
//     public int GuessNumberIsHigherOrLower(int n){
//         long l=1, r=n;
//         while(true){
//             long m=(l+r)/2;
//             int res = guess((int) m);
//             if(res>0){         // guess 1 i.e guess greater than m
//                 r=m-1;
//             }else if(res<0){
//                 l=m+1;
//             }else{
//                 return ((int) m);
//             }
//         }
//     }
// }

// "This code uses binary search to efficiently guess the number. I used long for l, r, and m to avoid integer overflow 
// when n is very large. In each step, I call guess(m):

// If it returns 1 (number is higher), I move the lower bound up (l = m + 1).

// If it returns -1 (number is lower), I move the upper bound down (r = m - 1).

// If it returns 0, I found the correct number and return it."