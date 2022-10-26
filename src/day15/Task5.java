package day15;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // Task 1: Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız. Verilen açılara göre;
        // "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren Java programını yazınız.
        //
        //Not: Üçgenin iç açıları toplamı 180'dir.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen geometrik şeklin (3 adet) iç açılarını giriniz");
        int aci1 = scan.nextInt();
        int aci2 = scan.nextInt();
        int aci3 = scan.nextInt();
        int acilarToplamı = 180 ;

        if (aci1+aci2+aci3==180){
            System.out.println("Bu şekil bir üçgendir .");

        }else {
            System.out.println("Bu şekil bir üçgen değildir .");

            System.out.println(aci1 == aci2 && aci2 == aci3 ? "Bu bir eşkenar üçgen" : "Bu şekil eşkenar üçgen değildir.");
        }

    }
}
