public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel ";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);

        int sayi = topla(15,7); // int metodundan değerler geldi
        System.out.println(sayi);

        int toplam = topla2(5,8,8,9,89787,454);
        System.out.println(toplam);
    }
    public static  void  ekle(){
        System.out.println("Eklendi");
    }
    public  static  void  sil(){
        System.out.println("Silindi");
    }
    public  static  void  güncelle(){
        System.out.println("Güncellendi");
    }
    public static  int topla(int sayi1,int sayi2){

        return sayi1 + sayi2; //return bitir ve 5 döndür
    }

    public static String sehirVer(){
            return "Kahramanmaraş";
    }
    public static int topla2(int... sayilar){ //İnteger array gibi davranır
        int toplam = 0;
        for (int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;
    }

}