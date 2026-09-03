import java.util.*;
class Frequency{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {1,2,1,5,4,6,8,9,4,5,6};

        for(int num : arr){
                map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }
}

// Find Frequency of element using HashMap
