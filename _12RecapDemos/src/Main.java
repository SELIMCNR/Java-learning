public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int Sonuc = dortIslem.Topla(3,4);
        System.out.println(Sonuc);

        Kutuphane kutuphane = new Kutuphane();
        kutuphane.Nesne();
        kutuphane.Game();

    }
}