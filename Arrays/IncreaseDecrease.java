package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class IncreaseDecrease {
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
        System.out.print("Ascending: ");
        for(int i: arr){
                System.out.print(i+" ");
        }
        System.out.println("\n");

        System.out.print("Decending: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
