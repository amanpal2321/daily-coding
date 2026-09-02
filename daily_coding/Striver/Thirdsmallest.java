import java.util.Scanner;
class Thirdsmallest{
    public static void main(String[] args) {
        System.out.print("Enter Array size: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of array: ");

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int thirdsmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]< secondsmallest  && arr[i]!=smallest){
                secondsmallest = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]< thirdsmallest  && arr[i]!=secondsmallest  && arr[i]!=smallest){
                thirdsmallest = arr[i];
            }
        }
        
        System.out.println("Smallest Element is : "+thirdsmallest);

    }
}