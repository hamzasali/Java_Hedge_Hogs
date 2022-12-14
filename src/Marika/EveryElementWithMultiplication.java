package Marika;

public class EveryElementWithMultiplication {

    public static void everyElementWithMult(int[] arr) {
        int n = arr.length;
        int prev = arr[0], temp; // previous element to be stored so that no extra space is used.
        arr[0] = arr[0] * arr[1];
        System.out.print(arr[0] + "  ");
        for (int i = 1; i < n - 1; i++) {
            temp = prev;
            prev = arr[i];//set previous to this element
            arr[i] = arr[i + 1] * temp; // multiply prev and forward element
            System.out.print(arr[i] + "  ");
        }
        arr[n - 1] = arr[n - 1] * prev;
        System.out.println(arr[n - 1]);
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};

      everyElementWithMult(nums);

    }
}