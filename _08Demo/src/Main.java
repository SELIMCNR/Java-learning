public class Main {
    public static void main(String[] args) {
        //Uygulamalar 1
        //AsalSayıHesaplama
        int number = 2;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean  İsPrime=false;

        if(number==1){
            System.out.println("Sayı Asal Değildir");
            return; // bu durumu sağlarsa dur.
        }

        if(number<2){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number;i++){
            if(number %i ==0) {
                İsPrime = false;
            }
        }

        if(İsPrime){
            System.out.println("Sayı Asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }

        //Uygulama 2
        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

        //Uygulama 3
        //Mukemmel Sayi  6-->1,2,3 toplamı 6 ve rakamlara bölünür
        int number1 =5;
        int total =0;

        for (int i=1;i<number1;i++){
            if(number1%i==0){
                total = total + i ;
            }
        }

        if(total == number1){
            System.out.println("Mükemmel sayıdır");
        }

        if(total == number1){
            System.out.println("Mükemmel sayıdır");
        }
        else {
            System.out.println("Mükemmel sayı değildir.");
        }


        //Uygulama 4 arkadaş sayı : 220-284 kendisi hariç pozitif tam sayı bölenleri kendisine eşit olan sayılardır.

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1=0;
        int toplam2=0;

        for(int i = 1 ; i<sayi1;i++){
            if(sayi1%i==0){
                toplam1= toplam1 + i;
            }
        }

        for(int i = 1 ; i<sayi2;i++){
            if(sayi2%i==0){
                toplam2= toplam2 + i;
            }
        }
        if(sayi1==toplam2 || sayi2 == toplam1){
            System.out.println("Bu iki sayı arkadaştır");
        }
        else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }

        //Uygulama 5
        int [] sayilar2 = new int []{1,2,3,4,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;
        for(int sayi : sayilar2){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayi mevcuttur");
        }
        else {
            System.out.println("Sayı mevcut değildir.");
        }


    }
}