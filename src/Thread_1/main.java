package Thread_1;

public class main {
    //Thread sınıfından
    //Runnable interfacesinden
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());//main threadi ismi
        System.out.println("maiın metodu başladı");
        Isci isci=new Isci();
        isci.setName("Isci Threadi");
        IsciRunnable iscıRunnable=new IsciRunnable();
        Thread iscirunnable=new Thread(iscıRunnable);
        iscirunnable.setName("İsci runnable threadi");
        iscirunnable.start();
        isci.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread başladı"+Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread biitt"+Thread.currentThread().getName());
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("Thread başladı ismi............."+Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread bittti................"+Thread.currentThread().getName());

            }
        }.start();

        System.out.println("Main metodu bitti");

    }
}
