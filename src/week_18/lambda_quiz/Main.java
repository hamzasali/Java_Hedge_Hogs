package week_18.lambda_quiz;

interface Runnable {
    void run();
}

//class System implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println();
//    }
//
//}

public class Main {

    public static void main(String[] args) {

//        System system = new System();                // Line 1
//        run(system);                                // Line 2

        run(()-> System.out.println("System running..."));

    }

    public static void run(Runnable runnable) {        // Line 3
        runnable.run();                                // Line 4
    }

}