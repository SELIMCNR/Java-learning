public class OrnekConstructor {

    public OrnekConstructor(int tc, int numara, int postkodu, String ad, String soyad, String sehir) {
        this.tc = tc;
        this.numara = numara;
        this.postkodu = postkodu;
        this.ad = ad;
        this.soyad = soyad;
        this.sehir = sehir;
    }

    int tc;
    int numara;
    int postkodu;
    String ad;
    String soyad;
    String sehir;

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getPostkodu() {
        return postkodu;
    }

    public void setPostkodu(int postkodu) {
        this.postkodu = postkodu;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }


}
