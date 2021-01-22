package TRheritage;

import TRheritage.Heritage;
import java.util.Scanner;


public class Start {

    public static void main(String[] args) {

        Heritage h = new Heritage();
        Scanner s = new Scanner(System.in);

        System.out.println("Miras miktarını giriniz");
        float a = s.nextFloat();

        System.out.println("Eşi yaşıyormu ?  Evet ise 1 Hayır 0 yazın");
        byte b = s.nextByte();

        System.out.println("Alt Soy sayısını giriniz");
        short c = s.nextShort();

        System.out.println("Üst Soy sayısını giriniz");
        short d = s.nextShort();

        h.calculate(a, b, c, d);

        System.out.println("Toplam miras: "+h.getMiras());
        System.out.println("Eşe kalan pay: "+h.getEsHakki());
        System.out.println("Kişi başı alt soy payı: "+h.getAltSoyKakki());

        if (h.getAltSoyHakki() > 0)
        {
            System.out.println("Alt soya miras kaldığı için \nüst soy miras alamaz");
        }
        else {
            System.out.println("Kişi başı üst soy payı: "+h.getUstSoyHakki());
        }

        if (h.getHazineyeDevredilen() > 0) {
            System.out.println("Varis yok miras hazine kaldı");
        }
    }
}
