package Thread_1;

public class Synchronized {

    public static void main(String[] args) {
        Yazici yazici=new Yazici(10);

        Thread ayse=new Ayse(yazici);
        Thread fatma=new Fatma(yazici);

        ayse.start();
        fatma.start();

    }


}

class Yazici{

    private int dokumanSayisi;
    private int i=0;
    public Yazici(int dokumanSayisi) {
        this.dokumanSayisi = dokumanSayisi;
    }
    //Aynı anda sadece tek bir thread işlem yapsın
    public synchronized void Yazdir(){

        for (i=dokumanSayisi; i>0;i--){

            System.out.println("Dokuman No:"+i+" Thread adi:"+Thread.currentThread().getName());

        }
    }

}

class Ayse extends Thread{

    private Yazici yazici;

    Ayse(Yazici yazici) {
        this.yazici = yazici;
    }

    @Override
    public void run() {
        yazici.Yazdir();
    }

}

class Fatma extends Thread{
    private Yazici yazici;

    public Fatma(Yazici yazici){
        this.yazici=yazici;
    }

    @Override
    public void run() {
        yazici.Yazdir();
    }
}
