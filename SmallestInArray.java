import java.util.Scanner;

public class SmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in an array: ");
        int num = sc.nextInt();
        System.out.println("Enter "+num+" numbers to Array");
        int arr[]= new int[num];
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            arr[i]=val;
        }
        System.out.println("Smallest number in the array is : ");
        int less = arr[0];
        for(int j=1; j<arr.length; j++){
            if(arr[j]<less){
                less=arr[j];
            }
        }
        System.out.print(less);
        sc.close();
    }
}
