
public class Otopark {
    
    private final int kapasite;
    private int ucret;
    private int kazanc;
    private Araba[] arabalar;
    
    public Otopark(int kapasite, int ucret) {
        this.kapasite = kapasite;
        this.ucret = ucret;
        this.arabalar = new Araba[kapasite];
                

    }
    
    public Otopark(Araba[] arabaListesi, int ucret) {
        this.kapasite = arabaListesi.length;
        this.ucret = ucret;
        this.arabalar = arabaListesi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getKazanc() {
        return kazanc;
    }

    public void setKazanc(int kazanc) {
        this.kazanc = kazanc;
    }

    public Araba[] getArabalar() {
        return arabalar;
    }

    public void setArabalar(Araba[] arabalar) {
        this.arabalar = arabalar;
    }
    
    public int getKapasite() {
        return this.kapasite;
    }
    
    public void aracEkle(Araba parkedilecekAraba) {
        
        boolean parkedildiMi = false;
        for (int i = 0; i < kapasite; i++) {
            if (arabalar[i] == null) {
                arabalar[i] = parkedilecekAraba;
                parkedildiMi = true;
                
                break;
            }
        }
        
        if (parkedildiMi) {
            System.out.println(parkedilecekAraba + " Başarıyla Parkedildi...");
        } else {
            System.out.println(parkedilecekAraba + " Araç Parkedilemedi Lütfen Bir"
                    + "Aracın Çıkmasını Bekleyin...");
        }
        
    }
    
    
    public void aracCikar(Araba cikarilacakAraba) {
        
        for (int i = 0; i < kapasite; i++) {
            if (cikarilacakAraba.equals(arabalar[i])) {
                arabalar[i] = null;
                this.kazanc+=this.ucret;
                System.out.println(cikarilacakAraba + " Araç Otoparktan Çıkarıldı...");
                
                break;
            }
        }
               
    }
    
    public String toString() {
        String txt = "";
        txt += "Kapasite : " + this.kapasite +"\n";
        txt += "Ücret : " + this.ucret +"\n";
        txt += "Toplam Kazanç : " + this.kazanc +"\n";
        txt += "Araçlar : \n";
        
        for (int i = 0 ; i < kapasite; i++) {
            if (this.arabalar[i] != null) {
                 txt += "    -" + arabalar[i].toString() + "\n";
            }
        }
        
        return txt;
        
        
    }
    
    
    
   
    
    
}


