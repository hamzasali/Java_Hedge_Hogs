package alena;

public class CountEvens {

    public static void main(String[] args) {

        int[] numbers={2,1,2,3,4};

        System.out.println(countEven(numbers));

    }

    public static int countEven (int[] numbers){

        int count=0;

        for (int each : numbers) {
            if(each%2==0){
                count++;
            }
        }
     return count;
    }

}
