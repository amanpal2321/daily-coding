import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        System.out.print("Enter Number element in array are : ");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();

       int[] arr = new int[n];
       System.out.print("Enter Element of Array: ");

        
        int largest=0;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Second Largest No is : "+secondlargest);
    }
}
