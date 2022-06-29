package Marika;

public class CountEven {
    public static int countEven(int [] array) {
        int count = 0;
        for (int each : array) {
            if(each % 2 ==0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,5};
        System.out.println(countEven(array));


    }

}
