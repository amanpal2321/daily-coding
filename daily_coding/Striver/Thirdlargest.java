import java.util.Scanner;
public class Thirdlargest {
    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Element: ");

        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int thirdlargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]> largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]> secondlargest  && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]> thirdlargest  && arr[i]!=secondlargest && arr[i] != largest){
                thirdlargest=arr[i];
            }
        }
        System.out.println("Third Largest Number: "+ thirdlargest);
    }
    
}
