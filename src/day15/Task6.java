package day15;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        // Task 2:
        //      Alan ve Çevre Hesaplama

        // 1. Kare
        //      2. Daire
        //      Seçiminiz:

        //     Yukarıdaki menüyü tasarlayınız.
        //              Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.

        //              Not: Seçim için switch kullanılacaktır.

        System.out.println("-".repeat(25));

        System.out.println("Alan ve Çevre Hesaplama");

        System.out.println("-".repeat(25));

        System.out.println("1.Kare için Alan ve çevre Hesaplama");
        System.out.println("2. Daire için Alan ve çevre Hesaplama");
        System.out.println("-".repeat(25));
        System.out.print("Seçiminiz :");

        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        System.out.println(secim);
        int sonuc = 0;
        double sonuc1 = 0;

        switch (secim) {
            case 1:
                System.out.print("kenar giriniz");
                System.out.print("kenar : ");
                int kenar = scan.nextInt();
                sonuc = kenar * kenar;
                sonuc = 4 * kenar;
                System.out.printf("Karenin alanı %d cm karedir. " +sonuc);
                System.out.printf("\"Karenin çevresi %d cm'dir.\"" +sonuc);


                break;

            case 2:
                System.out.print("Dairenin yarı çaıpını giriniz");
                System.out.print("Yarıçap (r) : ");
                double r = scan.nextDouble();
                sonuc1 = Math.PI * Math.pow(r, 2);
                System.out.println("DAİRENİN ALANI :" + sonuc1);
                sonuc1 = 2 * Math.PI * r;
                System.out.println("DAİRENİN ÇEVRESİ :" + sonuc1);


        }
        if (sonuc>0 & sonuc1>0) {
            System.out.println("Sonuç :" + sonuc);
            System.out.println("somuç :"+sonuc1);


        }
    }
}