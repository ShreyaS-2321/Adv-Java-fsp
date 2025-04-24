import java.util.*;

public class collections {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<> ();
        list1.add(23); list1.add(77); list1.add(88); list1.add(18);
        System.out.println(list1);
        list1.add(3,17);
        System.out.println(list1);
        list1.set(4,333);
        System.out.println(list1);
        list1.remove(4);
        System.out.println(list1);
        System.out.println("Index based iteration");
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("\nDynamic iteration");
        for(int ele:list1){
            System.out.print(ele+" ");
        }
        System.out.println("\nIteration using Iterator object");
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
