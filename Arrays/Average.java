package Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of an array: ");
        int num = sc.nextInt();
        System.out.println("Enter "+num+" numbers to array : ");
        int arr[]=new int[num];
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i:arr){
            count+=i;
        }
        int avg=count/num;
        System.out.println("Average: "+avg);

        sc.close();
    }
} 
 