public class Main {
    public static void main(String[] args) {

        //Classtan Product adında yeni obje oluşturduk ve constructora değerler ekledik
        Product product = new Product(1,"Laptop","Hp laptop",3050.5,3,"mavi"); //Constructor yapıcı metot özellikleri eklendi
        OrnekConstructor ornekConstructor = new OrnekConstructor(1,630,46100,"Selim","Çınar","Kahramanmaras");


        //Oluşturulan obje içerisindeki özeliiklere değer atadık
        product.set_name("Laptop");
        product.setId(1);
        product.set_description("Hp Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);

        ornekConstructor.setAd("Selim");
        ornekConstructor.setSoyad("Çınar");
        ornekConstructor.setNumara(630);
        ornekConstructor.setPostkodu(46100);
        ornekConstructor.setTc(415487);
        ornekConstructor.setSehir("Kahramanmaras");


        //ProductManager classı içerisinden productManager adlı nesne oluşturuldu
        ProductManager productManager = new ProductManager();
        ornek Ornek = new ornek();

        //productManager adlı oluşturulan nesne içerisindeki parametreli ADD metodu çalıştırıldı.
        productManager.Add(product);
        Ornek.add(ornekConstructor);
        Ornek.delete(ornekConstructor);
        Ornek.update(ornekConstructor);

        //Obje içerisinde değer atanan nesneyi yazdırdık.
        System.out.println(product.get_name());
        System.out.println(product.get_kod());

        System.out.println(ornekConstructor.getAd());
        System.out.println(ornekConstructor.getSoyad());
        System.out.println(ornekConstructor.getTc());
        System.out.println(ornekConstructor.getSehir());
        System.out.println(ornekConstructor.getPostkodu());



    }
}