public class base{
    int hesnum;
    String hesapad;
    double para;
    public  void hesekle(int hesnum, String hesapad, double para){
        this.hesnum=hesnum;
        this.hesapad=hesapad;
        this.para=para;
    }
    public void yatır(double tutar){
        para+=tutar;
        System.out.printf("hesaba %.2f tl yatırıldı",tutar);
    }
    public void çek(double tutar) {
        if(para<tutar)System.err.printf("HATA!\nHesabınızda %.2f tl var.",para);
        else {
            para-=tutar;
            System.out.printf("hesaptan %.2f tl çekildi",tutar);
        }
    }
    public void goster(){
        System.out.println(hesapad+"\n"+hesnum+"\n"+para);
    }
    public void kontrol(){
        System.out.println("Güncel bakiye: "+para);
    }

}
