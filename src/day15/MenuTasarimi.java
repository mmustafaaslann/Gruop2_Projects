package day15;

import java.util.Scanner;

public class MenuTasarimi {
    public static void main(String[] args) {

        // Dört işlem yapabilen hesap makinesi :

        System.out.println("-".repeat(20));

        System.out.println("  Dört İşlem  ");
        System.out.println("-".repeat(20));
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");
        System.out.println("-".repeat(20));
        System.out.print("Seçiminiz : ");

       Scanner scan = new Scanner(System.in);
       int secim = scan.nextInt();
        System.out.println(secim);
        int sonuc = 0 ;

        switch (secim){
            case 1 :
                System.out.println("Toplamı bulacak sayıları giriniz");
                System.out.print("Birinci sayı :");
                int n1 =scan.nextInt();
                System.out.print("İkinci sayı :");
                int n2 =scan.nextInt();
              boolean flag = true;
                break;
            case 2 :
                System.out.println("Birbirinden çıkartılacak sayıları giriniz");
                System.out.print("Birinci sayı :");
                n1 =scan.nextInt();
                System.out.print("İkinci sayı :");
                n2 =scan.nextInt();
                sonuc = n1-n2 ;
                break;
            case 3 :
                System.out.println("Çarpılacak sayıları giriniz");
                System.out.print("Birinci sayı :");
                n1 =scan.nextInt();
                System.out.print("İkinci sayı :");
                n2 =scan.nextInt();
                sonuc = n1*n2 ;
                break;
            case 4 :

                System.out.println("Bölünecek sayilari giriniz");
                System.out.print("Birinci sayı :");
                n1 =scan.nextInt();
                System.out.print("İkinci sayı :");
                n2 =scan.nextInt();
                sonuc = n1/n2 ;
                break;
            default:
                System.out.println(" Yanlış seçim yaptınız");
                flag =false;
                break;
        }
        if (true) {
            System.out.println("Sonuç :"+sonuc);

        }

    }
}
