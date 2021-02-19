package Thread_1;

public class Isci extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Isci sınfı thread başladı..."+Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("Isci sınfı thread bitti....."+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
