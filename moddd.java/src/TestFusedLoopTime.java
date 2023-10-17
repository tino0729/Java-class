import java.time.LocalDateTime;

public class TestFusedLoopTime {
    public static void main(String[] args) {
        long startTime, endTime;
        int x;
        final int rePeAT = 5_000_000;
        final int FACTor = 1_000_000;

        LocalDateTime now = LocalDateTime.now();
        startTime = now.getNano();

        for (x = 0; x < rePeAT; ++x) {
            method1();
        }

        for (x = 0; x < rePeAT; ++x) {
            method2();
        }

        now = LocalDateTime.now();
        endTime = now.getNano();

        System.out.println("Time for loops executed separately: " + ((endTime - startTime) / FACTor) + " milliseconds");

        now = LocalDateTime.now();
        startTime = now.getNano();

        for (x = 0; x < rePeAT; ++x) {
            method1();
            method2();
        }

        now = LocalDateTime.now();
        endTime = now.getNano();

        System.out.println("Time for loops executed together: " + ((endTime - startTime) / FACTor) + " milliseconds");
    }

    public static void method1() {
        // Stub method1, add your code here
    }

    public static void method2() {
        // Stub method2, add your code here
    }
}
