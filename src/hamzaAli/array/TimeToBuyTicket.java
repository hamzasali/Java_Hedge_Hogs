package hamzaAli.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;

public class TimeToBuyTicket {
    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 1};
        System.out.println(timeRequiredToBuy(nums, 0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
//        int time = 0;
//
//        do {
//            for (int i = 0; i < tickets.length; i++) {
//                if (tickets[i] != 0) {
//                    tickets[i] -= 1;
//                    time++;
//                }
//                if (tickets[k] == 0) {
//                    break;
//                }
//            }
//        } while (tickets[k] != 0);
//
//        return time;

        Queue<Integer> queue = Arrays.stream(tickets)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));
        int totalTime = 0;
        while (!queue.isEmpty()) {
            int leftTicketCount = queue.poll() - 1;
            totalTime++;
            if (leftTicketCount == 0) {
                if (k == 0) {
                    return totalTime;
                } else if (k > 0) {
                    k--;
                }

            } else {
                queue.add(leftTicketCount);
                if (k > 0) {
                    k--;
                } else if (k == 0) {
                    k = queue.size() - 1;
                }
            }
        }
        return totalTime;
    }
}
