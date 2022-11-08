package Marika;

public class Staircase {
        public static int steps(int n) {
            if (n ==1) {
                return 1;
            } if(n == 2) {
                return 2;
            } if(n == 3) {
                return 4;
            }

                return steps(n - 3) + steps(n - 2)
                        +steps(n - 1);
            }


        // Driver function
        public static void main(String argc[]){
            int n = 4;
            System.out.println(steps(n));
        }
    }

