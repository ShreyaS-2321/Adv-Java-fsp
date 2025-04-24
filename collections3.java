import java.util.*;

public class collections3 {
    public static void main(String[] args) {
        LinkedList<Double> list1 = new LinkedList<>();
        list1.add(12.55);
        list1.add(24.89);
        list1.add(88.43);
        list1.add(46.39);
        System.out.println(list1);
        list1.add(2,14.45);
        System.out.println(list1);
        list1.addFirst(97.32);
        System.out.println(list1);
        list1.addLast(67.45);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        list1.removeFirst();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);

        System.out.println("Index based iteration");
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("\nDynamic iteration");
        for(double ele:list1){
            System.out.print(ele+" ");
        }
        System.out.println("\nIteration using Iterator object");
        Iterator<Double> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
