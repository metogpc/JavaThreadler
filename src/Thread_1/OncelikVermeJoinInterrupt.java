package Thread_1;

public class OncelikVermeJoinInterrupt {

    public static void main(String[] args) {

        TekSayi t1=new TekSayi("1");
        TekSayi t2=new TekSayi("2");

        t1.setPriority(Thread.MAX_PRIORITY);//Max öncelik verildi
        t2.setPriority(Thread.MIN_PRIORITY);//Min öncelik verildi
        t2.start();
        t1.start();

        new Thread(){

            @Override
            public void run() {
                for(int i=0;i<100;i++){

                    if (i==10) {
                        try {
                            t1.join();//Diğer thread bitene kadar bekletme

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                        if(i==2){
                            System.out.println(ThreadsRenkler.Magenta+""+i+" Öncelik" +Thread.currentThread().getName());
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }



                }
            }
        }.start();

    }

}

class TekSayi extends Thread{

    String renk;

    public TekSayi(String name) {
        super(name);
        if(name.equals("1"))
            renk=ThreadsRenkler.Cyan;
        else
            renk=ThreadsRenkler.Red;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if(i%2==1)
                System.out.println(renk+" "+ i +" "+ Thread.currentThread().getPriority());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
