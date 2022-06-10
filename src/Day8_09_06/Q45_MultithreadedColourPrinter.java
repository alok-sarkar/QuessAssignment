package Day8_09_06;
class RedPrinter implements Runnable{
    public static final String TEXT_RED="\u001B[31m";
    public static final String TEXT_RESET="\u001B[0m";
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(TEXT_RED+"I am from RedPrinter and I am Writing in Red"+TEXT_RESET);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class GreenPrinter implements Runnable{
    public static final String TEXT_GREEN ="\u001B[32m";
    public static final String TEXT_RESET="\u001B[0m";
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(TEXT_GREEN +"I am from GreenPrinter and I am Writing in Green"+TEXT_RESET);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class YellowPrinter extends Thread{
    public static final String TEXT_YELLOW ="\u001B[33m";
    public static final String TEXT_RESET="\u001B[0m";
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(TEXT_YELLOW +"I am from YellowPrinter and I am Writing in Yellow"+TEXT_RESET);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Q45_MultithreadedColourPrinter {
    public static void main(String[] args) {
        RedPrinter printInRed= new RedPrinter();
        GreenPrinter printInBlue= new GreenPrinter();
        YellowPrinter printInYellow= new YellowPrinter();
        Thread blueThread= new Thread(printInBlue);
        Thread redThread= new Thread(printInRed);
        blueThread.start();
        printInYellow.start();
        redThread.start();

    }
}
