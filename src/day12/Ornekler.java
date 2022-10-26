package day12;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("üç sayı giriniz ve her birinde girdikten sonra entere basın");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
       boolean b1 = sayi1>sayi2;
       boolean b2 = sayi2>sayi3;
       boolean b3 = sayi1>sayi3;

        System.out.println(b1&&b2);
        System.out.println(b2||b3);
        System.out.println(b1||b3);
        System.out.println(b1^b3);
        System.out.println(!b1);



        }
    }
