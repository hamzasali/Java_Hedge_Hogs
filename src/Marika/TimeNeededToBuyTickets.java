package Marika;

public class TimeNeededToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) { // time - O(n); space - O(1)

        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i<=k) {
                time = time+Math.min(tickets[k],tickets[i]);
            } else {
                time = time+Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return  time;
    }

    public static void main(String[] args) {
        int [] tickets = {5,1,1,1};
        int k=0;
        System.out.println(timeRequiredToBuy(tickets,k));
    }
}

