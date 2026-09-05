import java.util.*;

 class Food {
    long taste;
    long decrease;

    Food(long taste, long decrease){
        this.taste=taste;
        this.decrease=decrease;
    }
}

public class Foods5
tamp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] v = new long[n];
        long[] d = new long[n];

        for (int i=0;i<n;i++){
            v[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            d[i]=sc.nextLong();
        }
        PriorityQueue<Food> pq = new PriorityQueue<>((a, b) -> Long.compare(b.taste, a.taste));

        for(int i=0;i<n;i++){
            pq.add(new Food(v[i], d[i]));
        }
        long answer = 0;

        for (int meal = 0 ; meal < m; meal++){
            Food current = pq.poll();

            if(current.taste <= 0)
                break;

            answer+= current.taste;

            current.taste-= current.decrease;

            pq.add(current);
        }
        System.out.println(answer);
    }
}

