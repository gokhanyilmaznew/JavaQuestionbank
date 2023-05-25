public class Type_Casting {
    public static void main(String[] args) {

        //1) Short data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.
        short a = 100;
        int b=a;


        //2) Long data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.

        long ln= 10000L;
        int ln1= (int) ln;

        //3) Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r float deg!sken!ne dönüstürünüz.
        double sayi=34.5;
        float yeniSayi=(float) sayi;

        //4) Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r short deg!sken!ne dönüstürünüz.
        //Sonrasında bu short deg!sken!n deger!n! konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

        double say1=1.2;
        short sayi2=(short) say1;

        System.out.println(sayi2);

      // 5) Byte data t!p!nde b!r deg!sken olusturunuz ve onu b!r double deg!sken!ne dönüstürünüz.
        //Sonrasında bu double deg!sken!n deger!n! konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

        byte by = 23;
        double db= by;
        System.out.println(db);







    }
}
