import java.util.*;

public class Thirdmax {
    public int thirdMax(int[] nums) {
        TreeSet <Integer> tm = new TreeSet<> ();
        for(int ele:nums){
            tm.add(ele);
        }
        if(tm.size()>3){
            tm.remove(tm.first());
        }
        return tm.size() == 3 ? tm.first() : tm.last();
    }
}
