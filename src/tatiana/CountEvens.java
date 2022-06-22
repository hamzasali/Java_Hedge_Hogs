package tatiana;

public class CountEvens {
    public static void main(String[] args) {
        int[]nums={2,3,4,5,6,6};

        System.out.println(countEvens(nums));


    }

    public static int countEvens(int[] nums){



        int countEvens=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                countEvens++;
            }

        }

        return countEvens;
    }
}
