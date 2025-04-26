import java.util.*;
public class twosumhashmap {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        int[] result = new int[2]; 
        for(int i=0;i<numbers.length;i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                result[0] = map.get(temp)+1;
                result[1] = i+1; 
                return result;   
            }
            map.put(numbers[i], i);
        }
        return  result;
    }
}
