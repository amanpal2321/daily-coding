//Linear Search of element in Array?
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i] == key){
                System.out.print("Element is Found at index :"+i);
                return;
            }
        }
         
                System.out.print("Element not Found in any Index");
            

    }
    
}
