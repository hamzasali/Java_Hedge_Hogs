package alena.twoSum_LinkedList;

import java.util.Arrays;

public class twoSum {

    public static void main(String[] args) {

        int[] nums = {16, 3, 11, 5, 15};
        int target = 8;

        MyList<Integer> list1 = new MyList<Integer>();
        for (int i = 0; i < nums.length; i++) {

            list1.add(i);
        }

        System.out.println(Arrays.toString(list1.twoSum(nums, target)));


    }
}
