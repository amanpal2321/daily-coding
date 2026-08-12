// Count Even and Odd Numbers in Array?
public class Program6 {
    public static void main(String[] args){
        int[] arr={4,8,6,2,7,9,61,5,80,95,81,20,};

        int EvenCount=0;
        int OddCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0 ){
                
                 EvenCount++;
            }
            else{
                OddCount++;
            }
        }
                 System.out.println("COUNT OF EVEN NUMBER ARE: "+EvenCount);
                System.out.println("COUNT OF ODD NUMBER ARE: "+OddCount);
    }
}
