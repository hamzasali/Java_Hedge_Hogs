package Marika;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int number : nums){
            if (!set.contains(number)) {
                set.add(number);
            }else set.remove(number);
        }
        return set.iterator().next();
    }
public static int singleNumber1(int[] nums) {
    int result = 0;
    for (int i = 0; i <nums.length ; i++) {
        result ^= nums[i];
    }
    return result;
}

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,4};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber1(nums));
    }
}

//In Java, the ^ (XOR) logical operator compares two or more conditional expressions and returns true if exactly one of the conditional expressions evaluates to true.
