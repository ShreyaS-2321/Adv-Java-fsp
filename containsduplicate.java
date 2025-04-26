import java.util.*;
public class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}

// int count=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1; j<nums.length;j++)
//             if(nums[i]==nums[j]) count++;
//         }
//         if(count>=1){
//             return true;
//         }
//         else return false;
//     }