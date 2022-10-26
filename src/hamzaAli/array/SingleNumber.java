package hamzaAli.array;

import java.util.ArrayList;
import java.util.HashSet;


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 3, 1, 5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) { //time:O(n),space:O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int each : nums) {
            if (!set.add(each)) { //O(1)
                set.remove(each); //O(1)
            }
        }
        return set.iterator().next();
//        return (int) set.toArray()[0];
    }
    public static int singleNumber1(int[] nums){ //time:O(n^2),space:O(n)
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)){
                list.remove(num);
            }else {
                list.add(num);
            }
        }
        return list.get(0);
    }

}
