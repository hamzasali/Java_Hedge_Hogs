package mizgin;

public class MissingNumber {

    public static void main(String[] args) {

        System.out.println(findMissingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(findMissingNumber(new int[]{3, 0, 1}));
        System.out.println(findMissingNumber(new int[]{0, 1}));

        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));

    }

    public static int findMissingNumber(int[] arr) {
        int sumArr = 0;
        for (int i : arr) {
            sumArr += i;
        }
        int n = arr.length;
        int sumAll = n * (n + 1) / 2;

        return sumAll - sumArr;
    }

    public static int missingNumber(int[] nums) { //xor
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

}
