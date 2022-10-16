public class Main {
    public static void main(String[] args) {

        //Metots kendini tekrarı önler

        sayiBulmaca("Beyaz"); // metot çağrıldı
        mesajVer(25);


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
}