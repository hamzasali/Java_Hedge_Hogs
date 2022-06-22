package cihat;

public class CountEvens {

    public static void main(String[] args) {

        System.out.println(countEvens(new int[]{2,1,2,3,4}));
        System.out.println(countEvens(new int[]{2,2,0}));
        System.out.println(countEvens(new int[]{1,3,5}));

    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
