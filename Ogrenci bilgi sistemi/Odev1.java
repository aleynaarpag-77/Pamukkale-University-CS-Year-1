import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen öğrenci sayısını giriniz:");
        int n = scn.nextInt();
        //numaraları ,isimleri,vizeleri ve finalleri daha rahat kullanabilmek için dizilerin içine attım
        int[] numaralar = new int[n];
        String[] isimler = new String[n];
        double[] vizeler = new double[n];
        double[] finaller = new double[n];

        int sectigin;

        do {//ne olursa olsun döngü bir kere çalışsın diye do-while döngüsü kullandım
            System.out.println("---MENÜ---");
            System.out.println("1-Bilgi Girisi Yap");
            System.out.println("2-Bilgileri Görüntüle");
            System.out.println("3-Sınav Sonucu Ortalamalarını Gör ");
            System.out.println("4-Sınav Sonucu 60 dan Küçük Olanların Listesini Gör");
            System.out.println("5-Ortalamanın Üstündekilerin Not Listesini Gör");
            System.out.println("6-Sınav Sonucu 60 dan Küçük Olanların Sayısını Gör");
            System.out.println("7-En Yüksek Sınav Sonucunu Gör");
            System.out.println("8-En Düsük Sınav Sonucunu Gör");
            System.out.println("9-Sınav Sonuclarının  Küçükten Büyüğe Sıralamasını Gör ");

            System.out.println("0- Çıkış Yap");
            System.out.print("Seçiminiz:");


            sectigin = scn.nextInt();

            switch (sectigin) {

                case 1:
                    bilgiGirisi(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 2:
                    bilgiGörüntüle(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 3:
                    ortalamaBul(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 4:
                    altmıstanKucukAlanlar(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 5:
                    ortalamaUstundekiler(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 6:
                    altmıstanKucukAlanlarınSayısı(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 7:
                    enYuksekNot(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 8:
                    enDusukNot(numaralar, isimler, vizeler, finaller, n);
                    break;
                case 9:
                    sıralamaYap(numaralar, isimler, vizeler, finaller, n);
                    break;

                default:
                    System.out.println("Geçersiz sayı girdiniz");

            }
        }
        while (sectigin != 0);
    }

    public static void bilgiGirisi(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < n; i++) {//teker teker tüm öğrencilerin bilgilerini alıyorum
            System.out.print((i + 1) + ". Öğrenci:");
            System.out.print("Numara: ");
            numara[i] = scn.nextInt();
            scn.nextLine();//enter tuşunu alır
            System.out.print("İsim: ");
            isim[i] = scn.nextLine();
            System.out.print("Vize: ");
            vize[i] = scn.nextDouble();
            scn.nextLine();//enter tuşunu alır
            System.out.print("Final: ");
            finaller[i] = scn.nextDouble();
        }
    }

    public static void bilgiGörüntüle(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < n; i++) {//kullanıcıdan aldığım verileri ekranda gösteriyorum
            System.out.println( " \t" +(i + 1) + ". Öğrenci:");
            System.out.println(" \t-Numara:" + numara[i]);
            System.out.println("\t-İsim:" + isim[i]);
            System.out.println("\t-Vize:" + vize[i]);
            System.out.println("\t-Final:" + finaller[i]);

        }
    }

    public static void ortalamaBul(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        System.out.println("--Not Ortalamaları--");

        for (int i = 0; i < n; i++) {//her öğrencinin ortalamasını buluyorum
            double ortalama = ((vize[i] * 0.4) + (finaller[i] * 0.6));
            System.out.println((i + 1) + ". Öğrenci:");
            System.out.println("Numara:" + numara[i] + " - İsim: " + isim[i] + " - Ortalaması: " + ortalama);


        }
    }


    public static void altmıstanKucukAlanlar(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        //vize ve finallerde 60 dan küçük alanları gösteriyorum
        for (int i = 0; i < n; i++) {
            if (vize[i] < 60) {
                System.out.println(" - " + isim[i] + " - " + numara[i] + "-notu" + vize[i]);

            }  if (finaller[i] < 60) {
                System.out.println(" - " + isim[i] + " - " + numara[i] + "-notu" + finaller[i]);
            }
        }
    }

    public static void ortalamaUstundekiler(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        double toplamOrtalama = 0;
        double[] bireyselOrtalamalar = new double[n];

        for (int i = 0; i < n; i++) {
            // Her öğrencinin ortalamasını hesaplayıp ve toplama  ekliyorum
            bireyselOrtalamalar[i] = (vize[i] * 0.4) + (finaller[i] * 0.6);
            toplamOrtalama += bireyselOrtalamalar[i];
        }
        double sinifGenelOrtalamasi = toplamOrtalama / n;//sınıfın genel ortalaması

        System.out.println("\n Sınıf Ortalaması: " + sinifGenelOrtalamasi);
        System.out.println("Ortalamanın Üstünde Alan Öğrenciler:");
        System.out.println(" İsim\t Numara\tVize\tFinal\tOrtalama");

        for (int i = 0; i < n; i++) {
            if (bireyselOrtalamalar[i] > sinifGenelOrtalamasi) {//ortalamanın üstündekileri bulmuş oluyorum
                System.out.println( isim[i]+"\t"+numara[i] + "\t" + vize[i] + "\t" + finaller[i] + "\t" + bireyselOrtalamalar[i]);
            }

        }
    }

    public static void altmıstanKucukAlanlarınSayısı(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        int sayac = 0;

        for (int i = 0; i < n; i++) {//vize ve finallerden toplam 60 dan küçük alanları buluyorum
            if (vize[i] < 60) {
                sayac++;
            } else if (finaller[i] < 60) {
                sayac++;
            }
        }
        System.out.println("60 dan küçük sınav notu olanların sayısı:" + sayac);
    }


    public static void enYuksekNot(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        double yuksekNot = 0;
        for (int i = 0; i < n; i++) {
            if (vize[i] > yuksekNot) {
                yuksekNot = vize[i];
            } if (finaller[i] > yuksekNot) {
                yuksekNot = finaller[i];

            }
        }
        System.out.println("En Yüksek sınav Sonucu:" + yuksekNot);
    }

    public static void enDusukNot(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {
        double dusukNot = 100;
        for (int i = 0; i < n; i++) {
            if (vize[i] < dusukNot) {
                dusukNot = vize[i];
            }  if (finaller[i] < dusukNot) {
                dusukNot = finaller[i];
            }
        }
        System.out.println("En Düsuk sınav Sonucu:" + dusukNot);
    }

    public static void sıralamaYap(int[] numara, String[] isim, double[] vize, double[] finaller, int n) {

        double[] ort = new double[n];
        for (int i = 0; i < n; i++) {//bu for ortalamları bulup belli bir dizinin içine atıyor
            ort[i] = (vize[i] * 0.4) + (finaller[i] * 0.6);
        }
        //Yan yana olan iki elemanı birbiriyle karşılaştırıp yerlerini değiştiriyorum
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Eğer soldaki öğrencinin ortalaması sağdakinden büyükse
                if (ort[j] > ort[j + 1]) {
                    //Yer değiştirme (Her şeyi sırayla kaydırdım)
                    double gOrt = ort[j];
                    ort[j] = ort[j + 1];
                    ort[j + 1] = gOrt;

                    int gNo = numara[j];
                    numara[j] = numara[j + 1];
                    numara[j + 1] = gNo;

                    String gIsim = isim[j];
                    isim[j] = isim[j + 1];
                    isim[j + 1] = gIsim;

                    double gVize = vize[j];
                    vize[j] = vize[j + 1];
                    vize[j + 1] = gVize;

                    double gFin = finaller[j];
                    finaller[j] = finaller[j + 1];
                    finaller[j + 1] = gFin;


                }
            }
        }
        System.out.println("--- BAŞARI SIRALAMASI (DÜŞÜKTEN YÜKSEĞE) ---");
        for (int i = 0; i < n; i++) {
            System.out.println("No: " + numara[i] + "\tİsim: " + isim[i] + "\tOrtalama: " + ort[i]);

        }
    }


}



