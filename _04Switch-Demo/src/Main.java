public class Main {
    public static void main(String[] args) {
            //Switch-Case yapısı

        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
            case 'C':
                System.out.println("İyi :  geçtiniz ");
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
            case 'F':
                System.out.println("Maalesef kaldınız");
            default:
                System.out.println("Geçersiz not girdiniz");

        }

        int a=20;
        int b=15;
        char islem= '+';
        switch (islem){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("Geçersiz işlem");
                break;
        }



    }
}