import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    base yenihes = new base();
	    double tutar;
	    Scanner in = new Scanner(System.in);
	    System.out.println("İşlem seçin: \n1: Hesap Ekleme\n2: Para Yatırma\n3: para Çekme\n4: Bakiye Kontrol\n5: Hesap Bilgilerimi Göster");
        while(true){
	        int secim = in.nextInt();
	        if(secim==1){
	            yenihes.hesekle(1, "Toprak Gün", 2000);
	        }
            else if(secim==2){
                tutar = in.nextInt();
                yenihes.yatır(tutar);
            }
            else if(secim==3){
                tutar = in.nextInt();
                yenihes.çek(tutar);
            }
            else if(secim==4){
               yenihes.kontrol();
            }
            else if(secim==5){
                yenihes.goster();
            }
        }

	}
}