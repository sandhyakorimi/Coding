package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Median {
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
        double median;
        if(num%2==0){
                    int val = num/2;
            median = (arr[val-1]+arr[val])/2.0;
        }
        else{
            median = arr[num/2];
        }
        System.out.println("Median is: "+median);

        sc.close();
    }
}
