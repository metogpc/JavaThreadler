package Thread_1;

public class UreticiTuketici {
    public static void main(String[] args) {

        OrtakAlan ortakalan=new OrtakAlan();
        Uretici uretici=new Uretici(ortakalan);
        Tuketici tuketici=new Tuketici(ortakalan);

        uretici.start();
        tuketici.start();

    }
}

class OrtakAlan{
    private int veri;

    public void veriYaz(int veri){
        this.veri=veri;
    }

    public int verGetir(){
        return veri;
    }

}

class Uretici extends Thread{
    private OrtakAlan ortakAlan;

    Uretici(OrtakAlan ortakAlan) {
        this.ortakAlan = ortakAlan;
    }


    @Override
    public void run() {

        for (int i=0;i<10;i++){
            ortakAlan.veriYaz(i);
            System.out.println(ThreadsRenkler.Magenta+"Uretici konulan veri"+i);
        }

    }

}

class Tuketici extends  Thread{

    private OrtakAlan ortakAlan;

    Tuketici(OrtakAlan ortakAlan) {
        this.ortakAlan = ortakAlan;
    }


    @Override
    public void run() {
        int deger;
        for(int i=0;i<10;i++){
            deger=ortakAlan.verGetir();

            System.out.println(ThreadsRenkler.Green+"Getirilen veri"+deger);

        }
    }
}
