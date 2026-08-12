// Find smallest number in array?

public class Program4 {
    public static void main(String[] args){
        int[] arr={4,5,8,76,2};

        int smallest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Number in array is: "+smallest);
    }
}
