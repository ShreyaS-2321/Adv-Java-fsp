import java.util.*;
public class stringanagram2 {
    public static boolean areAnagrams(String s1, String s2) {

        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<> ();
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch: s2.toCharArray()){
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)<0) return false;
        }
        return true;
    }
}
