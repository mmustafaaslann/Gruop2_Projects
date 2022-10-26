package day14;

import java.util.Scanner;

public class IfStatmentSoruCozumu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("saati tam sayı şeklinde giriniz ");
        int saat =scan.nextInt();
        System.out.println("ödeme oranını giriniz");
        double odemeOranı = scan.nextDouble();

        if (saat>40){
            System.out.println(odemeOranı*1.5);
        }



    }
}
