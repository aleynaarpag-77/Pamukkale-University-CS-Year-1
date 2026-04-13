

public class Araba {
    
    private String plaka;
    private String aracSahibi;
    
    public Araba(String plaka, String aracSahibi) {
        
        this.plaka = plaka;
        this.aracSahibi = aracSahibi;
        
    }
    
    public String getPlaka() {
        return this.plaka;
    }
    
    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }
    
    public String getAracSahibi() {
        return this.aracSahibi;
    }
    
    public void setAracSahibi(String aracSahibi) {
        this.aracSahibi = aracSahibi;
    }
    
    public String toString() {
        return this.plaka + " - " + this.aracSahibi;
    }
    
}
