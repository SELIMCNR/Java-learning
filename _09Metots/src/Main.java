public class Main {
    public static void main(String[] args) {

        //Metots kendini tekrarı önler

        sayiBulmaca("Beyaz"); // metot çağrıldı
        mesajVer(25);
        Tekmi(25);
        Pozitifmi(-2);
    }
    public static  void sayiBulmaca(String kırmızı){
            for (int i = 0 ; i<25;i++){
                System.out.println("Bu bir metotdur");
                System.out.println(kırmızı);
            }
    }
    public  static  void  mesajVer(int aranacak){

        System.out.println("Sayıdır" + aranacak);
    }

    //Ornek 3
    public static  void  Tekmi(int sayi){
        if (sayi %2 ==0){
            System.out.println("Sayi çiftir");
        }
        else {
            System.out.println("Sayi tektir");
        }
    }

    public  static  void  Pozitifmi(int sayi){
        if (sayi<0){
            System.out.println("Sayi negatif");
        }
        else {
            System.out.println("Sayi pozitif");
        }
    }
}