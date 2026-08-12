//Find largest number in array?
class Program3{
    public static void main(String[] args){
        int[] arr={4,5,8,6,2,7};

        int largest=0;
      for (int i=0;i<arr.length;i++){
        if (arr[i] > largest)
        largest = arr[i];
      }
      System.out.println("Largest number in  Arrar is: "+ largest);
    }
}