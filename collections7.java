import java.util.*;

public class collections7 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> list = new LinkedHashMap<> ();
        list.put(1,"A");
        list.put(2,"B");
        list.put(3,"C");
        list.put(4,"D");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println("\nDynamic iteration");
        for(int ele : list.keySet()){
            System.out.print(list.get(ele)+" ");
        }
    }
}
