package mizgin;

public class CountEvens {

    public static void main(String[] args) {

        int[] arr = {2,1,2,3,4};
        int[] arr2 = {1,3,5};

        System.out.println(countEvents(arr));
        System.out.println(countEvents(arr2));
    }
    public static int countEvents(int[] arr){
        int count=0;
        for (int each : arr){
            if (each%2 == 0){
                count++;
            }
        }
        return count;
    }
}
