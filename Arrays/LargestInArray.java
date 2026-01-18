package Arrays;
import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The largest number is : ");
        int large = arr[0];
        for(int j=1; j<arr.length; j++){
            if(arr[j]>large){
                large=arr[j];
            }
        }
        System.out.print(large);
        sc.close();
    }
}
