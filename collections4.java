import java.util.*;

public class collections4 {
    public static void main(String[] args) {
        HashSet<String> player = new HashSet<> ();
        player.add("ABD");
        player.add("Virat");
        player.add("Shubman");
        player.add("Rohit");
        System.out.println(player);
        player.remove("Rohit");
        System.out.println(player);
        System.out.println("\nDynamic iteration");
        for(String ele:player){
            System.out.print(ele+" ");
        }
        System.out.println("\nIteration using Iterator object");
        Iterator<String> itr = player.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
