public class Main {
    public static void main(String[] args) {

        //NumaraDizisi 1.tanımlama
        double[] myLis = new double[4];
        myLis[0] = 2000.30;

        //NumaraDizisi 2.tanımlama
        //uygulama
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) { //(myList içindekileri gez numner değişkenine ekle)
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = "+ total);
        System.out.println("En Büyük = "+max);




    }
}