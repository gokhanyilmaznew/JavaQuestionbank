public class StringManipulation {
    public static void main(String[] args) {

        //1) Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
        //!sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
        //yazdırınız.
        //Örnek: mIAMI - Miami
        //miami - Miami
        //MIAMI - Miami
        //mIaMi - Miami vb.

        String sehirIsim="mIAMI";
        String konsolIsim=sehirIsim.trim().toLowerCase();
        String str=konsolIsim.substring(0, 1).toUpperCase()+konsolIsim.substring(1);
        System.out.println(str);


//        2) K!s! !s!mler! !ç!n 3 Str!ng deg!sken olusturunuz. Bosluk karakterler! har!ç 3 !s!mdek!
//            karakter sayısının toplamını yazdırınız.
//                Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
        String isim1="Ali Can";
        String isim2="Merve Star";
        String isim3="Mark Tom";
        int isim11=isim1.replaceAll("[^a-zA-z]", "").length();
        int isim22=isim2.replaceAll("[^a-zA-z]", "").length();
        int isim33=isim3.replaceAll("[^a-zA-z]", "").length();
        System.out.println(isim11 + isim22 + isim33);

        //3) B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! toplam alfabet!k ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
        String x="Miami 33018!!!";
        int sonuc=x.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(sonuc);


        //4) B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

        String rakamOlmayanDeger="1a3Bcf4!...";
        System.out.println(rakamOlmayanDeger.replaceAll("[0-9]", "").length());

        //5) B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
        //karakter! yazdırınız.
        //Örnek: 'Ali Can' için n yazdırmalısınız.
        //‘Miami’ için i yazdırmalısınız.
        String isim="Ali Can";
        int nt= isim.trim().length()-1;
        String nt1=isim.substring(nt,nt+1);
        System.out.println(nt1);

        //6) B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
        //toplamını bulunuz.

        String str1="Yusuf Kerem";
        int sonKarakter=str1.length()-1;
        System.out.println(str1.charAt(0) + str1.charAt(sonKarakter));

        //7) B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsolda
        //yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
        String str2="Java";
        System.out.println(str2.substring(1));

        //8) B!r Str!ng deg!sken! olusturunuz ve son karakter! dısındak! tüm karakterler!n! konsolda
        //büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
        String str3="Java";



    }
}
