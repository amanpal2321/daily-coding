class Selectionsort{
    public static void main(String[] args) {
        int[] a={5,6,8,9,2,7,6};
        selectionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void selectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int min=a[i], minIndex=i;

            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    minIndex=j;
                }
            }
            a[minIndex]=a[i];
            a[i]=min;
        }
    }
}