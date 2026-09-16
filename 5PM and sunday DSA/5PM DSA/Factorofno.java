class Factorofno{
    public static void main(String[] args) {
        int n=18;
        printAndcountFactors(n);
    }
    public static void printAndcountFactors(int n){
        System.out.println(1+" "+n+" ");
        int count =2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count+=1;
            }
        }
        System.out.println("\nTotal Factors are:"+ count);
    }
}

