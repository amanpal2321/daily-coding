//  sorted the array

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
            System.out.println("Enter Size or Array:");
        int n =sc.nextInt();
            System.out.println("Enter Elements of Array:");
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                   int  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        System.out.println("Sorted Array is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
            sc.close();
    }
    
}
