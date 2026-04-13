

public class NYP7 {

    public static void main(String[] args) {
        
        Araba araba1 = new Araba("20 AVT 20", "Can Yılmaz");
        Araba araba2 = new Araba("20 BVT 20", "Can Yılmaz");
        Araba araba3 = new Araba("20 CVT 20", "Can Yılmaz");
        
        Otopark otp = new Otopark(10, 5);
        
        otp.aracEkle(araba1);
        otp.aracEkle(araba2);
        otp.aracEkle(araba3);
        otp.aracCikar(araba3);
        otp.aracEkle(araba3);
        otp.aracCikar(araba2);
        
        System.out.println(otp);
        
    }
}
