package Question1;

public class Ortalama {

    public static void main(String[] args) {
        int toplam=0; // bölünen sayıların toplamı
        int sayac=0; //kaç tane sayı
        int ortalama=0;

        for ( int i=0 ; i <= 2000 ; i++) {
            if ( i%3==0 && i%5==0 && i%7==0 && i%53==0 ) {
                toplam = toplam + i;
                sayac++;
            }
            if ( sayac == 0 ) {
                sayac=1;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Bölünen sayıların ortalaması: " + ortalama );
    }

}
