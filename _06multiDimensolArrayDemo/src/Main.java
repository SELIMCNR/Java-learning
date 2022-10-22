public class Main {
    public static void main(String[] args) {
        //Çok boyutlu dizi
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Kahramanmaraşspor";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("--------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

        //2.ornek
        String books[][] = new String[3][4];
        books[0][0] = "C";
        books[0][1] = "C++";
        books[0][2] = "C#";
        books[0][3] = "Nesne";
        books[1][0] = "Java";
        books[1][1] = "Python";
        books[1][2] = "Javascript";
        books[1][3] = "Pyqite";
        books[2][0] = "Sql";
        books[2][1] = "DbSql";
        books[2][2] = "Jqry";
        books[2][3] = "Kotlin";

        for (int i = 0; i <= 2; i++) {
            System.out.println("*********0");
            for (int j = 0 ; j <= 2;j++){
                System.out.println(books[i][j]);
            }
        }
    }
}