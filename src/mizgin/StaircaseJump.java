package mizgin;

public class StaircaseJump {

    public static void main(String[] args) {

        System.out.println(findStep(3));
        System.out.println(findStep(4));
        System.out.println(findStep(5));

        System.out.println("-----------------");

        System.out.println(findStep2(3));
        System.out.println(findStep2(4));
        System.out.println(findStep2(5));

    }

    private static int findStep(int n) {
        //if n is equal to zero then return 1 as it is the starting stair
        if ( n == 0){
            return 1;
        }
        else if (n < 0) {
            return 0;
        }
        //call the function recursively with values n-1, n-2 and n-3 and sum up the values
        else {
            return findStep(n - 3) + findStep(n - 2) + findStep(n - 1);
        }
    }
    //Time Complexity: O(3^n)
    //Space Complexity:O(1)

    private static int findStep2(int n){
        //base cases
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        //Run a loop from 3 to n
        for (int i = 3; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }
    //Dynamic Programming - bottom up approach
    //Time Complexity: O(n)
    //Space Complexity: O(n)
}
