import java.util.*;

public class collections5 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> num = new LinkedHashSet<> ();
        num.add(17);
        num.add(18);
        num.add(77);
        num.add(45);
        System.out.println(num);
        num.remove(45);
        System.out.println(num);
        System.out.println("\nDynamic iteration");
        for(Integer ele:num){
            System.out.print(ele+" ");
        }
        System.out.println("\nIteration using Iterator object");
        Iterator<Integer> itr = num.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
