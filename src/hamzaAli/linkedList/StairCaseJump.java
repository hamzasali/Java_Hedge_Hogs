package hamzaAli.linkedList;

public class StairCaseJump {
    public static void main(String[] args) {

        System.out.println(count(3));

    }

    static int count(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return count(n - 1) + count(n - 2) + count(n - 3);
    }
}
/*
Simba has a number of staircases in his house and he likes to climb each staircase
1, 2, or 3 steps at a time. Given the respective heights for each of the staircases
in his house, find and print the number of ways he can climb each staircase.
In other words, find the possible variation counts of climbing a staircase of which
length is your input.
 */