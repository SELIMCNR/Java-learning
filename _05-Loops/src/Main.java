public class Main {
    public static void main(String[] args) {

        //For loops
        for (int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        //2.Ornek
        for (int i=1;i<100;i*=5){
            System.out.println("Sayi : "+i);
        }

        //While Loops
        int i=1;
        while(i<10){
          System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        //2.Ornek
        while (i<100){
            System.out.println("Sayi : "+i);
            i*=3;
        }
        System.out.println("Döngü sonu");

        //Do While Loops
        int j=1; //once do çalıştında bir defa j değişkeni yazılır.
        do {
            System.out.println("Loglandı");
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

        //2.Ornek
        do{
            System.out.println("Nolursa olsun 1 kere çalışır");
            System.out.println(j);
            j*=3;
        }while (j<100);


    }
}