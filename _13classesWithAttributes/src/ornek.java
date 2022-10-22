public class ornek {


    public  void  add(OrnekConstructor ornekConstructor){

        System.out.println("Uye eklendi adı: "+ornekConstructor.getAd());
        System.out.println("Uye eklendi soyadı: "+ornekConstructor.getSoyad());
        System.out.println("Uye eklendi Sehri: "+ornekConstructor.getSehir());
        System.out.println("Uye eklendi tc: "+ornekConstructor.getTc());
    }
    public  void delete(OrnekConstructor ornekConstructor){
        System.out.println("Uye silindi posta kodu : "+ornekConstructor.getPostkodu());
    }
    public  void update(OrnekConstructor ornekConstructor){
        System.out.println("Uye numarası guncellendi : "+ornekConstructor.getNumara());
    }
}
