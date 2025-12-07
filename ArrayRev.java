import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter those " +num+" Elements: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        int mid=num/2;
        for(int i=0;i<mid;i++){
            int temp = arr[i];
            arr[i]=arr[num-1-i];
            arr[num-1-i]=temp;
        }
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}
