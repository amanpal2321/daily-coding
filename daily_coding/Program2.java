// Print number 1 to N
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
        int n = sc.nextInt();

      System.out.println("Numbers are: ");

        for (int i=1;i<=n;i++){
          System.out.println(i);  
        }
        sc.close();
    }
    
}
