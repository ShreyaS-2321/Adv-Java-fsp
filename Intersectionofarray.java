import java.util.*;
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

public class Intersectionofarray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add all elements of nums1 to the map with their count
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for intersection with nums2
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultSet.add(num);
            }
        }

        // Convert resultSet to an array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}
