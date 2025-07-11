package step06.p06;

public class WaterTank implements Runnable {
    private static final int MAX = 100;
    private static final Object lock = new Object();
    private static int tankNum = 1;
    private final int num;
    private final int nextNum;
    private int water;

    public WaterTank(int num) {
        this.num = num;
        this.nextNum = num + 1;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (tankNum != num) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }

                while (water < MAX) {
                    water += 10;
                    System.out.println("물 저장소 " + num + ": " + water + "리터");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }

                tankNum = nextNum;
                System.out.println();
                lock.notifyAll();

                if (nextNum == 6) {
                    System.out.println("\n물 채우기가 완료되었습니다.");
                }

                break;
            }
        }
    }
}
