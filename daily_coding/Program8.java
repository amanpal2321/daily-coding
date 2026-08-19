//Find Second Largest Number?
public class Program8 {
    public static void main(String[] args){
        int[] arr={4,6,8,2,7,96,1,5,2,4,5,55};

        int largest=arr[0];
        int secondlargest=arr[0];

        for(int i=0;i<arr.length;i++){
            if (arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
           else if( arr[i] > secondlargest  && secondlargest != largest ){
            secondlargest = arr[i];
            }
        }
        System.out.println("Second Largest Element in Array is: "+secondlargest);
    }
}
