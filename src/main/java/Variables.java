import java.util.Scanner;

public class Variables {
//1) Herhangi b!r 3 ögenin fiyatları !ç!n double data tipinde degiskenler olusturunuz. Fiyatların
//toplamını konsola yazdırınız.
public static void main(String[] args) {
    double sapka= 1.5;
    double gomlek=1.12;
    double ceket=20.3;
    double pantolo=13.2;
    System.out.println("Toplam Fiyat=>" +(sapka+gomlek+ceket+pantolo));

//    2) Herhang! b!r 3 öge !ç!n float, long ve !nteger data t!p!nde deg!skenler olusturunuz. Bu
//    deg!skenler!n degerler!n!n çarpımını konsolda yazdırınız.
    float etek=15.99f;
    long elbise= 90L;
    int ayakkabi= 30;
    System.out.println("toplam carpim="+(etek*elbise*ayakkabi));

    //3) Bas!t fa!z! bulmak !ç!n b!r kod yazınız.
    //Not: Basit faiz formülü = anapara * oran * yılDegeri /100

    int a= 10000,b=6,c=3;
    int x=a*b*c/100;
    System.out.println(x);

    //4) B!r Str!ng ve !k! long data t!p!nde deg!sken olusturunuz. Konsolda bu long deg!skenler!n
    //toplamını ve çarpımını Str!ng !le yazdırınız.
    String str="ahmet";
    long ln=34l;
    long k=2222l;
    System.out.println(str + (ln + k));
    System.out.println(str+ln*k);
    //5) Degerler! farklı olan !k! boolean data t!p!nde deg!sken olusturunuz ve bu degerler! !k!
    //ardısık deger arasında bosluk bırakacak sek!lde aynı satırda yazdırınız.
    boolean bo=true;
    boolean boo=false;
    System.out.println(bo + " " + boo);

    //6) 3 öge (k!tap, defter ve laptop) f!yatı !ç!n long data t!p!nde deg!skenler olusturunuz.
    //Konsolda 2 k!tap, 4 defter ve 3 laptop !ç!n toplam f!yatını yazdırınız.
    long kitap=33L;
    long defter=50000l;
    long laptop=100000l;
    System.out.println("Toplam Fiyat=>"+((2*kitap)+(4*defter)+(3*laptop)));

    //Ik! tamsayıyı deg!st!rmek !ç!n b!r kod yazınız.
    Scanner input= new Scanner(System.in);
    System.out.println("2 Sayi giriniz");
    int n1=input.nextInt();
    int n2=input.nextInt();
    System.out.println("degistirmeden once:"+n1+"-"+n2);

    //1.yol

    int n3=n1;
    n1=n2;
    n2=n3;
    System.out.println(n1+"-"+n2);

    //2.yol
    n1=n1+n2;
    n2=n1-n2;
    n1=n1-n2;
    System.out.println(n1+"="+n2);








}

}
