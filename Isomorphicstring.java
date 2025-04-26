// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
import java.util.*;
public class Isomorphicstring {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<> ();
        HashMap<Character,Integer> map2 = new HashMap<> ();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int i=0;i<arr1.length;i++){
            if(map1.containsKey(arr1[i])){
                if(map1.get(arr1[i]) != map2.get(arr2[i])){
                    return false;
                }
            }else{
                map1.put(arr1[i],i);
            }
            if(map2.containsKey(arr2[i])){
                if(map2.get(arr2[i]) != map1.get(arr1[i])){
                    return false;
                }
            }else{
                map2.put(arr2[i],i);
            }
        }
        return true;
    }
}
