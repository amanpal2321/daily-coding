public class Program15 {
    
    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 8, 15};

        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;

        // Find largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Find second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        System.out.println("Second Largest Element = " + secondsmallest);
    }
}
    

