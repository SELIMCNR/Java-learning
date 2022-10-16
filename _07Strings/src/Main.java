public class Main {
    public static void main(String[] args) {
        //Stringler metin
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        //String metotları
        System.out.println("Elaman sayısı : "+mesaj.length()); //Değişken uzunluğunu belirtir.
        System.out.println("5.eleman: "+mesaj.charAt(4));   //Mesaj değişkeninde 5.karakteri gösterir.
        System.out.println(mesaj.concat(" Yaşasın!")); //Concat birleştirme
        System.out.println(mesaj); //değişkeni yazdırır.
        System.out.println(mesaj.startsWith("B")); // mesaj B ile başlıyorsa true döndürür
        System.out.println(mesaj.endsWith(".")); // mesaj . ile bitiyormu

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); // (0 dan başla,4'e kadar,karakterler dizisine ata,karakterler dizisinin 0.indeksten beri aktar)
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // 0'dan başla a karakterini bul
        System.out.println(mesaj.lastIndexOf("a")); //sağdan sondan başla  a karakterini bul
        //Metotlar2

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); // (2.indexten itibarn 5'e kadar al)
        System.out.println(yeniMesaj);
        for (String kelime:mesaj.split(" ")){ // (boşluğa göre ayır)
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //Hepsini küçük harf yap
        System.out.println(mesaj.toUpperCase()); //Hepsini büyük harf yap
        System.out.println(mesaj.trim()); //başındaki ve sondaki boşlukları atar

    }
}