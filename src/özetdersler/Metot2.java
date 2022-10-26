package özetdersler;

import java.util.Scanner;

public class Metot2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen doğum yılınızı  giriniz");
        int mecudYıl =scan.nextInt();
        System.out.println("lütfen mevcut yılı giriniz");
        int doğumYılı = scan.nextInt();
        System.out.println(yasHesapla(mecudYıl,doğumYılı));


    }
    public static int yasHesapla(int doğumYılı,int mevcudYıl){
        int age = mevcudYıl-doğumYılı;
        return age;

    }
}
