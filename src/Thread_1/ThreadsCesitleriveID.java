package Thread_1;

public class ThreadsCesitleriveID {

    public static void main(String[] args) {

        MyThreads t1=new MyThreads("thread1",5,ThreadsRenkler.Cyan);//User Thread
        t1.start();

        MyThreads t2=new MyThreads("DeamonThread",10,ThreadsRenkler.Red);//Daemon Thread arka planda devamlı devam eder program bitmeyi beklemez bunun için
        t2.setDaemon(true);
        t2.start();

    }



}




class MyThreads extends Thread{

    private int uykuSaniyesi;
    private String renk;

    public MyThreads(String name,int uykuSaniyesi,String renk) {
        super(name);
        this.uykuSaniyesi=uykuSaniyesi;
        this.renk=renk;
    }

    @Override
    public void run() {

        try {
            System.out.println(renk+" İsimli threadim basladi...."+this.uykuSaniyesi+" saniye bekledi"+currentThread().getName());
            Thread.sleep(uykuSaniyesi*1000);
            System.out.println(renk+ " İsimli Threadim bitti...." +this.uykuSaniyesi+" saniye bekledi"+ currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
