package NotortalamaHesaplama;
import java.util.Scanner;


public class notOrtamalaHesaplama {
    public static void main(String[] args) {
        int turkce,mat,fizik,kimya,muzik,tarih;  //int olarak belirtmiş olduğumuz dersler

        Scanner giris = new Scanner(System.in);

        System.out.print("Turkce notunuz: ");
        turkce = giris.nextInt();

        System.out.print("Matematik notunuz: ");
        mat = giris.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = giris.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = giris.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = giris.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = giris.nextInt();
        int topl = turkce + mat + fizik + kimya + tarih + muzik; //ortalama hesapladığımız bölüm
        int sonuc = topl / 6;
        //koşul sağlama kısmı
        boolean kosul= sonuc>=60;
        String gecti = kosul ? "Sinifi Gecti" : "Sinifta Kaldı";
        System.out.println("Ortalama : " + sonuc);
        System.out.println(gecti);
    }
    
}
