package Question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class q3 {

    public int sum(int[] nums) {

        int abc = 0;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> min = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                min.add(nums[i]);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);

            }
        }
        for (int i : min) {
            if (map.get(i) > 1) {
                abc = abc + i;
            }
        }
        return abc;
    }
}
  // public static void main(String[] args) { //just for test
       // q3 qq = new q3();
        //int[] nums = {1, 3, 2, 3};
        //System.out.println(qq.sum(nums));
   // }


