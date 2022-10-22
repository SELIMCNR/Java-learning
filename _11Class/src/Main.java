public class Main {
    public static void main(String[] args) {
        //Classlar referanc type'lı
        //Classdan new ile nesne ürettik
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        OrnekClass ornekClass = new OrnekClass();
        ornekClass.Mesaj();
        ornekClass.Tekmi(25);

        //Yığına(Stack) class ekleniyor , Heap'e classtan oluşturulan nesne ve özellikleri ekleniyor

        CustomerManager customerManager2 = new CustomerManager();
        OrnekClass ornekClass1 = new OrnekClass();
        ornekClass1.Mesaj();

        //Class üzerinden obje oluşturma 2.yöntem
        CustomerManager customerManager3;
        OrnekClass ornekClass2;
        customerManager = customerManager2; // iki classda aynı referansa sahip oldu

        ornekClass1 = ornekClass;
        ornekClass1.Tekmi(15);

        //Value Types :Değer tipler
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;  // sayi 2 10 oldu , sayi1 20 oldu
        sayi1 = 30;
        System.out.println(sayi2);


        //Referance Types : Referans Tipler
        // array referans tiplidir

        int [] sayilar1 = new int [] {1,2,3};
        int [] sayilar2 = new int [] {4,5,6};
        sayilar2 = sayilar1;  // sayilar2 nin yeni değerleri sayilar1 den gelecek
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);




    }
}

