// Find smallest element in array?

public class Program12 {
    public static void main(String[] args){
        int[] arr = {12,2,13,45,55,6,78,8,9};

        int smallest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
                
            }
        }
         System.out.println(smallest);
    }
    
}
