package Arrays;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of an array: ");
        int num = sc.nextInt();
        System.out.println("Enter "+num+" numbers to array : ");
        int arr[]=new int[num];
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
        sc.close();
    }
}
