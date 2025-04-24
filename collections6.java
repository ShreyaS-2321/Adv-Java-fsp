import java.util.*;

public class collections6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> list = new HashMap<> ();
        list.put(2,4);
        list.put(3,5);
        list.put(6,7);
        list.put(8,9);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println("\nDynamic iteration");
        for(Map.Entry<Integer, Integer> ele : list.entrySet()){
            System.out.print(ele.getKey() + " ");
        }
        System.out.println("\nIteration using Iterator object");
        for(int ele : list.keySet()){
            System.out.print(list.get(ele)+" ");
        }
    }
}
