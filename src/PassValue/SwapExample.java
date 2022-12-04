package PassValue;

/**
 * Understanding the exercise :
 * 1.Let us refer to Integer reference I in main as I-main and Integer J as J-main.
 * 2.Let us refer to Integer reference I in Function as I-copy and Integer J as J-copy .
 * 3.We pass I-main and J-main but as java is call by value it creates copies of I-main
 * as I-copy and J-main as J-copy.
 * 4.Now J-copy and I-copy have only one thing in common to their main counterpart is the objects they hold.
 * 5.Now after reference variable temp is created and assigned a value same is value of I-copy.
 * we assign i=j. This statement basically does this I-copy=J-copy which means reference I-copy is simply referring/Holding to whatever Object J-copy is referring/Holding. Since the only change/impact I-copy and J-copy can have on I-main and J-main is via object modification which is not done here Our references in main are still intact .
 * 6.The second statement j=temp does this J-copy=temp means reference J-copy is simply referring/Holding to whatever Object temp is referring/Holding . Since the only change/impact I-copy and J-copy can have on I-main and J-main is via object modification which is not done here Our references in main are still intact .
 * 7.Result no change and no swap.
 */
public class SwapExample {

    // swap() doesn't swap i and j
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }

    public static void swap(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }
}
