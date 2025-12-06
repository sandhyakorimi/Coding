import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfNum {
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
        int count =1;
        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1&&arr[j]==arr[j+1]){
                count++; 
            }else{
            System.out.println("Frequency of "+arr[j]+" is :"+count);
            count=1; 
            }
        }
        sc.close();
    }
}
