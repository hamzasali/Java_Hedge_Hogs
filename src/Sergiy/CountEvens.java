package Sergiy;

public class CountEvens {

    public static int countEven(int[] arr){
        int count = 0;
        for (int each : arr) {
            if(each%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,2,3,4};
        System.out.println(countEven(arr));

    }

}
