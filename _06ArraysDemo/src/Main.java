public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String takım4 = "Fenerbahçe";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(takım4);

        System.out.println("------------------");

        //Array Dizi tanımı
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------");
        for(String ogrenci:ogrenciler){ //(ogrenciler içindeki ogrenciyi yazdır.)
            System.out.println(ogrenci);
        }

        //2.Ornek
        String[] books = {"Java","C","C++","C#","Sql"};
        for (String book:books){
            System.out.println(book);
        }

    }
}