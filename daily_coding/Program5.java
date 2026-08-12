// Calculate  Sum and Average of  Array Elements?
class Program5{
    public static void main(String[] args){
        int[] arr={4,6,8,9,5,2,3};

        int Sum = 0;
        int Average = 0;

        for(int i=0;i<arr.length;i++){
            Sum = Sum + arr[i];
            Average= Sum / arr.length;
        }
System.out.println("Sum of Elements is: "+ Sum);
System.out.println("Average of Elements is: "+ Average);

    }
}