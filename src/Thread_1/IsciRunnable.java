package Thread_1;

public class IsciRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("IsciRUnnabler başladı Thread Ismi:......"+Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("Isci runnable bitti Thread ismi......"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
