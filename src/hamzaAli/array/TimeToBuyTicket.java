package hamzaAli.array;

public class TimeToBuyTicket {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2};
        System.out.println(timeRequiredToBuy(nums, 2));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        do {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i] -= 1;
                    time++;
                }
                if (tickets[k] == 0) {
                    break;
                }
            }
        } while (tickets[k] != 0);
        return time;
    }
}
