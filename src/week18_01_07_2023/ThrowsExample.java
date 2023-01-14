package week18_01_07_2023;

public class ThrowsExample{
    public static void main(String[] args) throws InterruptedException {
        waitFor(3);
    }

    private  static void waitFor(int seconds) throws InterruptedException {
        Thread.sleep(3000);
    }
}
