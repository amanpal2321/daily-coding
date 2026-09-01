import java.util.Scanner;
public class Secondlargest {
    public static void main(String[] args) {
        System.out.println("Enter Array size: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        int largest=0;
        int secondlargest=-1;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]> largest){
                largest= arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("SecondLargest Element is: "+ secondlargest);

    }
    
}
